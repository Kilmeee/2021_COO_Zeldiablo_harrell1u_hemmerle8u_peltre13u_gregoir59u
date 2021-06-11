package fr.iamonstre;

import fr.placeable.entites.Entite;

/**
 * @class
 * Classe d'une position
 */

public class Position {

    /**
     * attributs entiers qui est égal à la position x et y de la Position
     */
    private int x, y;

    /**
     * Constructeur à 1 paramètre
     * @param e
     *      Entite
     */
    public Position(Entite e) {
        this.x = e.getX();
        this.y = e.getY();
    }

    /**
     * Méthode publique permettant d'ajouter un x ou un y à la position
     * @param x
     *      entier
     * @param y
     *      entier
     */
    public void setPosition(int x, int y) {
        this.x += x;
        this.y += y;
    }

    /**
     * Getters
     * @return
     *      int
     */

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
