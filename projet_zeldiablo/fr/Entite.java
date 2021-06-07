package fr;

import fr.moteurJeu.Commande;

public abstract class Entite {

    private Labyrinthe lab;

    protected int x, y;

    public Entite(Labyrinthe lab) {
        this.x = lab.getTailleX()/2;
        this.y = lab.getTailleY()/2;
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
        if (direction.haut && y > 0){
            this.y--;
        } else if (direction.bas && y < 590){
            this.y++;
        } else if (direction.gauche && x >0){
            this.x--;
        } else if (direction.droite && x < 990){
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
