package fr.placeable;

import fr.JeuZeldiablo;
import fr.Labyrinthe;

import java.awt.*;

public abstract class Placeable {

    protected static JeuZeldiablo jeu;
    protected static Labyrinthe lab;

    public static void setup(JeuZeldiablo jeuZeldiablo, Labyrinthe labyrinthe) {
        jeu = jeuZeldiablo;
        lab = labyrinthe;
    }

    public void declencher() {
    }

    public boolean isCaseVide(int x, int y) {
        return false;
    }

    public void dessiner(Graphics2D g, int i, int i1) {

    }

}
