package fr.placeable.entites;

import fr.Labyrinthe;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public abstract class Monstre extends Entite {

    public Monstre(int x, int y) {
        super(x, y);
        this.pv = 10;
        this.degats = 1;
    }

    public Monstre() {
        super();
        this.pv = 10;
        this.degats = 1;
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
}
