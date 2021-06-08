package fr.placeable.entites;

import fr.Labyrinthe;

import java.awt.*;

public class Personnage extends Entite {

    /**
     * Constructeur qui défjnit la postion initiale en paramètres
     * @param x
     * @param y
     */
    public Personnage(int x, int y) {
        super(x, y);
        this.pv = 20;
    }

    /**
     * Concstructeur qui définit la postion initiale par défaut au milieu du labyrinthe.
     */
    public Personnage(){
        super();
        this.pv = 20;
    }

    @Override
    public void dessiner(Graphics2D g, int i, int i1) {
        g.setColor(Color.BLUE);
        g.fillOval(x * Labyrinthe.TAILLE_CASE, y * Labyrinthe.TAILLE_CASE
                , Labyrinthe.TAILLE_CASE, Labyrinthe.TAILLE_CASE);
    }
}
