package fr.placeable;

import fr.JeuZeldiablo;
import fr.Labyrinthe;
import fr.placeable.entites.Entite;

import java.awt.*;

public abstract class Placeable {

    protected static JeuZeldiablo jeu;
    protected static Labyrinthe lab;

    /**
     *
     * @param jeuZeldiablo
     * @param labyrinthe
     */
    public static void setup(JeuZeldiablo jeuZeldiablo, Labyrinthe labyrinthe) {
        jeu = jeuZeldiablo;
        lab = labyrinthe;
    }

    /**
     *
     * @param e
     */
    public void declencher(Entite e) {
    }

    /**
     *
     * @param e
     */
    public void prendreEpee(Entite e){
    }

    /**
     *
     * @param e
     */
    public void prendrePotion(Entite e){
    }

    /**
     *
     * @param x
     * @param y
     * @return
     */
    public boolean isCaseVide(int x, int y) {
        return false;
    }

    /**
     * Permet de dessiner l'élément en question
     * @param g
     * @param i
     * @param i1
     */
    public void dessiner(Graphics2D g, int i, int i1) {

    }

    /**
     *
     * @return
     */
    public boolean isTrouver() {
        return false;
    }
}
