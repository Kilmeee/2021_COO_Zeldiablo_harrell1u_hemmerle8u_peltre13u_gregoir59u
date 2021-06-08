package fr.placeable.entites;

import fr.Labyrinthe;

import java.awt.*;

public class Personnage extends Entite {

    /**
     * Constructeur qui défjnit la postion initiale en paramètres
     * @param x
     * @param y
     */
    public Personnage(int x, int y, Labyrinthe lab) {
        super(x, y, lab);
        this.pv = 20;
    }

    @Override
    public Color getColor() {
        return null;
    }

    /**
     * Concstructeur qui définit la postion initiale par défaut au milieu du labyrinthe.
     * @param lab
     */
    public Personnage(Labyrinthe lab){
        super(lab);
        this.pv = 20;
    }
}
