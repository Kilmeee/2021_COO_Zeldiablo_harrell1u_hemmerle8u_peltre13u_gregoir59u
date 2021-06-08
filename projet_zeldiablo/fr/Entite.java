package fr;

import fr.moteurJeu.Commande;

public abstract class Entite implements Placeable {

    private Labyrinthe lab;

    protected int x, y;

    public Entite(Labyrinthe lab) {
        this.x = 0;
        this.y = 0;
        this.lab = lab;
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
        } else if (direction.bas && y < lab.getTailleY()-1){
            this.y++;
        } else if (direction.gauche && x >0){
            this.x--;
        } else if (direction.droite && x < lab.getTailleX()-1){
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
