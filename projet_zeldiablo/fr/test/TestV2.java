package fr.test;

import fr.JeuZeldiablo;
import fr.Labyrinthe;
import fr.placeable.entites.Monstre;
import fr.placeable.entites.Personnage;
import fr.moteurJeu.Commande;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestV2 {

    private JeuZeldiablo jeu = new JeuZeldiablo();

    @Test
    public void test_constructeur_Labyrinthe() {
        Labyrinthe labyrinthe = new Labyrinthe();
        assertEquals(100, labyrinthe.getTailleX());
        assertEquals(60, labyrinthe.getTailleY());
    }

    @Test
    public void test_constructeur_Entite() {
        Labyrinthe lab = new Labyrinthe();
        Personnage personnage = new Personnage(10,11);
        Monstre monstre = new Monstre(20,2);
        personnage.ajouterLab(lab);
        monstre.ajouterLab(lab);
        assertEquals("position x differente pour personnage.",10, personnage.getX());
        assertEquals("position y differente pour personnage.",11, personnage.getY());
        assertEquals("position x differente pour monstre.",20, monstre.getX());
        assertEquals("position y differente pour monstre.",21, monstre.getY());
    }

    @Test
    public void test_constructeur_seDeplacer() {
        Labyrinthe lab = new Labyrinthe();
        Personnage personnage = new Personnage(10,10);
        personnage.ajouterLab(lab);
        Commande commande = new Commande();
        commande.droite = true;
        personnage.deplacer(commande);
        assertEquals("La postion apres deplacement devrait etre a 2",11,personnage.getX());
    }



    @Test public void test_methode_isCaseVide() {
        Labyrinthe lab = new Labyrinthe();
        Personnage personnageQuiBloque = new Personnage(10,10);
        Personnage personnageQuiBouge = new Personnage(10,11);
        personnageQuiBouge.ajouterLab(lab);
        personnageQuiBloque.ajouterLab(lab);
        Commande commande = new Commande();
        commande.haut = true;
        personnageQuiBouge.deplacer(commande);
        assertEquals("La postion devrait rester à 11",11,personnageQuiBouge.getY());
    }
}
