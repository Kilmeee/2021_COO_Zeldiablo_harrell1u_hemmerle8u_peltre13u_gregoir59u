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
        personnage.ajouterLab(lab);
        monstre.ajouterLab(lab);
        assertEquals("position x differente pour personnage.",0, personnage.getX());
        assertEquals("position y differente pour personnage.",1, personnage.getY());
        assertEquals("position x differente pour monstre.",0, monstre.getX());
        assertEquals("position y differente pour monstre.",0, monstre.getY());
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

    @Test
    public void test_methode_isCaseVide() {
        Labyrinthe lab = new Labyrinthe();
        Monstre monstreQuiBloque = new Troll(0,0);
        Personnage personnageQuiBouge = new Personnage(0,1);
        personnageQuiBouge.ajouterLab(lab);
        monstreQuiBloque.ajouterLab(lab);
        Commande commande = new Commande();
        commande.haut = true;
        personnageQuiBouge.deplacer(commande);
        assertEquals("La postion devrait rester à 11",1,personnageQuiBouge.getY());
    }
}
