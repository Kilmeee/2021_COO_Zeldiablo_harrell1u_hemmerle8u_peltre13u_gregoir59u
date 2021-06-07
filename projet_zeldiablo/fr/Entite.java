package fr;

import fr.moteurJeu.Commande;

public abstract class Entite {

    private Labyrinthe lab;

    protected int x, y;

    public Entite(Labyrinthe lab) {
        this.x = 0;
        this.y = 0;
    }

    public Entite(int x, int y, Labyrinthe lab) {
        this.x = x;
        this.y = y;
        this.lab = lab;
    }

    /**
     * Méthode deplacer qui consiste à déplacer le personnage en fonction du paramètre Commande.
     * @param direction
     */
    public void deplacer(Commande direction){
        int valX = x * Labyrinthe.TAILLE_CASE;
        int valY = y * Labyrinthe.TAILLE_CASE;
        if (direction.haut && valY > 0){
            this.y--;
        } else if (direction.bas && valY < 600 - Labyrinthe.TAILLE_CASE){
            this.y++;
        } else if (direction.gauche && valX >0){
            this.x--;
        } else if (direction.droite && valX < 1000 - Labyrinthe.TAILLE_CASE){
            this.x++;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
