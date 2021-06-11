package fr.placeable.entites;

import fr.Labyrinthe;

/**
 * @class Monstre
 * Classe abstraite qui modelise un monstre
 */
public abstract class Monstre extends Entite {

    protected int timer;

    /**
     *
     * @param x
     * @param y
     */
    public Monstre(int x, int y) {
        super(x, y);
    }

    /**
     *
     */
    public Monstre() {
        super();
    }

    /**
     *
     * @param lab
     *      Labyrinthe
     * @return
     *      boolean
     */
    @Override
    public boolean ajouterJeu(Labyrinthe lab) {
        boolean res = super.ajouterJeu(lab);
        if(res) jeu.getMonstres().add(this);
        return res;
    }

    /**
     *
     * @return
     */
    public boolean attaquer() {
        boolean res = false;
        Personnage personnage = jeu.getPersonnage();
        if(((personnage.getX() == x+1 || personnage.getX() == x-1) && personnage.getY() == y)
                || ((personnage.getY() == y+1 || personnage.getY() == y-1) && personnage.getX() == x)) {
            personnage.diminuerPv(this.degats);
            res = true;
        }
        return res;
    }

    /**
     *
     * @param timer
     */
    public void evoluer(int timer) {
        if(timer % this.timer == 0) if(!attaquer()) deplacer();
    }
}
