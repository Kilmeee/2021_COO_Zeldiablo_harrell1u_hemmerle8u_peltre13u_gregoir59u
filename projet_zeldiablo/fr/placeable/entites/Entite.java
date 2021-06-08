package fr.placeable.entites;

import fr.Labyrinthe;
import fr.moteurJeu.Commande;
import fr.placeable.Placeable;

import java.awt.*;

public abstract class Entite implements Placeable {

    private Labyrinthe lab;

    protected int x, y;

    protected int pv;

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
        if (direction.haut && y > 0 && lab.isCaseVide(x,y-1)){
            this.y--;
            lab.isDeclenchable(x,y);
        } else if (direction.bas && y < lab.getTailleY()-1 && lab.isCaseVide(x,y+1)){
            this.y++;
            lab.isDeclenchable(x,y);
        } else if (direction.gauche && x >0 && lab.isCaseVide(x-1,y)){
            this.x--;
            lab.isDeclenchable(x,y);
        } else if (direction.droite && x < lab.getTailleX()-1 && lab.isCaseVide(x+1,y)){
            this.x++;
            lab.isDeclenchable(x,y);
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public abstract Color getColor();
}
