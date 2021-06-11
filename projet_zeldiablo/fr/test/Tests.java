package fr.test;

import fr.JeuZeldiablo;
import fr.Labyrinthe;
import fr.placeable.entites.Monstre;
import fr.placeable.entites.Personnage;
import fr.moteurJeu.Commande;
import fr.placeable.entites.Troll;
import org.junit.Test;

import static org.junit.Assert.*;

public class Tests {

    private JeuZeldiablo jeu = new JeuZeldiablo();

    @Test
    public void test_constructeur_Labyrinthe() {
        Labyrinthe labyrinthe = new Labyrinthe();
        assertEquals(20, labyrinthe.getTailleX());
        assertEquals(12, labyrinthe.getTailleY());
    }

    @Test
    public void test_constructeur_Entite() {
        Labyrinthe lab = new Labyrinthe();
        Personnage personnage = new Personnage(0,1);
        Monstre monstre = new Troll(0,0);
        personnage.ajouterJeu(lab);
        monstre.ajouterJeu(lab);
        assertEquals("position x differente pour personnage.",0, personnage.getX());
        assertEquals("position y differente pour personnage.",1, personnage.getY());
        assertEquals("position x differente pour monstre.",0, monstre.getX());
        assertEquals("position y differente pour monstre.",0, monstre.getY());
    }

    @Test
    public void test_constructeur_seDeplacer() {
        Labyrinthe lab = new Labyrinthe();
        Personnage personnage = new Personnage(10,10);
        personnage.ajouterJeu(lab);
        Commande commande = new Commande();
        commande.droite = true;
        personnage.deplacer(commande);
        assertEquals("La postion apres deplacement devrait etre a 11",11,personnage.getX());
    }

    @Test
    public void test_methode_isCaseVide() {
        Labyrinthe lab = new Labyrinthe();
        Monstre monstreQuiBloque = new Troll(0,0);
        Personnage personnageQuiBouge = new Personnage(0,1);
        personnageQuiBouge.ajouterJeu(lab);
        monstreQuiBloque.ajouterJeu(lab);
        Commande commande = new Commande();
        commande.haut = true;
        personnageQuiBouge.deplacer(commande);
        assertEquals("La postion devrait rester à 11",1,personnageQuiBouge.getY());
    }

    @Test
    public void test_methode_attaquer() {
        Labyrinthe lab = new Labyrinthe();
        Monstre monstre = new Troll(0, 0);
        Personnage personnage = new Personnage(1, 0);
        personnage.ajouterJeu(lab);
        monstre.ajouterJeu(lab);
        assertTrue("Le troll devrait attaquer", monstre.attaquer());
        assertEquals("Le personnage devrait être à 15 pv", 15, personnage.getPv());
    }

    @Test
    public void test_methode_attaquerSansSeDeplacer() {
        Labyrinthe lab = new Labyrinthe();
        Monstre monstre = new Troll(0, 0);
        Personnage personnage = new Personnage(1, 0);
        personnage.ajouterJeu(lab);
        monstre.ajouterJeu(lab);
        if(!monstre.attaquer()) monstre.deplacer();
        assertEquals("Le monstre ne devrait pas s'être déplacé", 0, monstre.getX());
        assertEquals("Le monstre ne devrait pas s'être déplacé", 0, monstre.getY());
    }

    @Test
    public void test_methode_prendrePotion() {
        Labyrinthe lab = new Labyrinthe();
        Monstre monstre = new Troll(0, 0);
        Personnage personnage = new Personnage(1, 0);
        personnage.ajouterJeu(lab);
        monstre.ajouterJeu(lab);
        monstre.diminuerPv(5);
        personnage.diminuerPv(5);
        monstre.prendrePotion();
        personnage.prendrePotion();

        assertEquals("Le troll devrait avoir 45 pv", 45, monstre.getPv());
        assertEquals("Le personnage devrait avoir 20 pv", 20, personnage.getPv());
    }

    @Test
    public void test_methode_prendreEpee() {
        Labyrinthe lab = new Labyrinthe();
        Personnage personnage = new Personnage(1, 0);
        personnage.ajouterJeu(lab);
        personnage.prendreEpee();

        assertEquals("Le personnage devrait avoir 8 dégâts", 8, personnage.getDegats());
    }

    @Test
    public void test_monstre_prend_epee(){
        Labyrinthe lab = new Labyrinthe();
        Troll monstre = new Troll(13, 0);
        monstre.ajouterJeu(lab);
        monstre.prendreEpee();
        assertEquals("Le monstre devrait avoir 5 dégâts", 5, monstre.getDegats());
    }

    @Test
    public void test_methode_gagne() {
        Labyrinthe lab = new Labyrinthe();
        Personnage personnage = new Personnage(1, 0);
        lab.getCarte()[4][19].declencher(personnage);

        assertTrue("Le personnage devrait avoir gagné", personnage.isArrive());
    }

    @Test
    public void test_methode_declencher() {
        Labyrinthe lab = new Labyrinthe();
        Personnage personnage = new Personnage(1, 0);
        lab.getCarte()[2][14].declencher(personnage);

        assertEquals("Le personnage devrait avoir 15 pv", 15, personnage.getPv());
    }

    @Test
    public void test_methode_isTrouver() {
        Labyrinthe lab = new Labyrinthe();
        Personnage personnage = new Personnage(1, 0);

        assertFalse("Le piège ne devrait pas être trouvé", lab.getCarte()[2][14].isTrouver());

        lab.getCarte()[2][14].declencher(personnage);

        assertTrue("Le piège devrait être trouvé", lab.getCarte()[2][14].isTrouver());
    }

    @Test
    public void test_methode_monstre_deplacerSurEpee() {
        Labyrinthe lab = new Labyrinthe();
        Monstre monstre = new Troll(13, 0);
        Commande commande = new Commande();
        commande.droite = true;
        monstre.deplacer(commande);
    }

}
