package fr.placeable.entites;

import fr.Labyrinthe;
import fr.moteurJeu.Commande;
import fr.placeable.Placeable;
import fr.placeable.cases.CaseVide;

public abstract class Entite extends Placeable {

    private Labyrinthe lab;

    protected int x, y;

    protected int pv;

    public Entite() {
        this.x = 0;
        this.y = 0;
    }

    public Entite(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Méthode deplacer qui consiste à déplacer le personnage en fonction du paramètre Commande.
     * @param direction
     */
    public void deplacer(Commande direction){
        if (direction.haut && y > 0 && lab.getCarte()[y-1][x].isCaseVide(x, y-1)){
            this.y--;
        } else if (direction.bas && y < lab.getTailleY()-1 && lab.getCarte()[y+1][x].isCaseVide(x, y+1)){
            this.y++;
        } else if (direction.gauche && x >0 && lab.getCarte()[y][x-1].isCaseVide(x-1, y)){
            this.x--;
        } else if (direction.droite && x < lab.getTailleX()-1 && lab.getCarte()[y][x+1].isCaseVide(x+1, y)){
            this.x++;
        } else {
            return;
        }
        lab.getCarte()[y][x].declencher(this);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void diminuerPv(int degats){
        this.pv -= degats;
    }

    public boolean ajouterLab(Labyrinthe lab) {
        boolean res = false;
        if(lab.getCarte()[y][x].isCaseVide(x, y)) {
            this.lab = lab;
            res = true;
        }
        return res;
    }
}
