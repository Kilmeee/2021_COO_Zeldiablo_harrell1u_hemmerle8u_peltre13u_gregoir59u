package fr.placeable.entites;

import fr.Labyrinthe;

public abstract class Monstre extends Entite {

    protected int timer;

    public Monstre(int x, int y) {
        super(x, y);
    }

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
    public boolean ajouterLab(Labyrinthe lab) {
        boolean res = super.ajouterLab(lab);
        if(res) jeu.getMonstres().add(this);
        return res;
    }

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

    public void evoluer(int timer) {
        if(timer % this.timer == 0) if(!attaquer()) deplacer();
    }
}
