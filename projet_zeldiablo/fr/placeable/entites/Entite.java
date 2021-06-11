package fr.placeable.entites;

import fr.Labyrinthe;
import fr.iamonstre.DeplacementUtil;
import fr.iamonstre.Position;
import fr.moteurJeu.Commande;
import fr.placeable.Placeable;

/**
 * @class Entite
 * Classe abstraite qui modelise une entite
 */
public abstract class Entite extends Placeable {

    protected Labyrinthe lab;

    protected int x, y, pv, maxPv;
    protected boolean dead;
    protected int degats;

    /**
     *
     */
    public Entite() {
        this.x = 0;
        this.y = 0;
        this.dead = false;
        this.degats = 2;
    }

    /**
     *
     * @param x
     * @param y
     */
    public Entite(int x, int y) {
        this.x = x;
        this.y = y;
        this.dead = false;
    }

    /**
     * Méthode deplacer qui consiste à déplacer le personnage en fonction du paramètre Commande.
     * @param direction
     *      Direction
     */
    public void deplacer(Commande direction){
        if(dead) {
            return;
        }
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

    /**
     * Méthode déplacer aléatoire des monstres
     */
    public void deplacer() {
        Position position = DeplacementUtil.deplacementAleatoire(this);
        int posX = position.getX();
        int posY = position.getY();
        int i = 0;
        while(posX >= lab.getTailleX() || posX < 0 || posY >= lab.getTailleY() || posY < 0 || !lab.getCarte()[posY][posX].isCaseVide(posX, posY)
                || (posX == jeu.getPersonnage().getX() && posY == jeu.getPersonnage().getY())) {
            position = DeplacementUtil.deplacementAleatoire(this);
            posX = position.getX();
            posY = position.getY();
            if(i > 4) return;
            i++;
        }
        this.x = posX;
        this.y = posY;
        lab.getCarte()[y][x].declencher(this);

    }

    /**
     * retourne la position x
     * @return
     */
    public int getX() {
        return x;
    }

    /**
     * retourne la position y
     * @return
     */
    public int getY() {
        return y;
    }

    /**
     * retourne les points de vies
     * @return
     */
    public int getPv(){
        return this.pv;
    }

    /**
     * retourne les dégats
     * @return
     */
    public int getDegats() {
        return this.degats;
    }

    /**
     * retourne un boolean si l'entite est morte.
     * @return
     */
    public boolean isDead() {
        return this.dead;
    }

    /**
     * permet de retirer des points de vie à l'entite
     * @param degats point de vie retirée
     */
    public void diminuerPv(int degats){
        if(degats >= 0) {
            if(this.pv - degats <= 0) {
                this.pv = 0;
                this.dead = true;
            } else {
                this.pv -= degats;
            }
        }
    }

    /**
     * permet d'ajouter des points de vie à l'entite
     * @param pv
     */
    public void ajouterPv(int pv) {
        if(pv >= 0) {
            if(this.pv + pv > maxPv) {
                this.pv = maxPv;
            } else {
                this.pv += pv;
            }
        }
    }

    /**
     *  Sert à ajouter une entite au jeu.
     * @param lab
     * @return
     */
    public boolean ajouterJeu(Labyrinthe lab) {
        boolean res = false;
        if(lab.getCarte()[y][x].isCaseVide(x, y)) {
            this.lab = lab;
            res = true;
        }
        return res;
    }

    /**
     *
     */
    public void gagne() { }

    /**
     *
     * @return
     */
    public boolean prendreEpee() {
        return false;
    }

    /**
     *
     * @return
     */
    public boolean prendrePotion() {
        return false;
    }
}
