package fr.placeable.entites;

import fr.JeuZeldiablo;
import fr.Labyrinthe;

import java.awt.*;

public class Monstre extends Entite {

    public Monstre(int x, int y) {
        super(x, y);
        this.pv = 10;
    }

    public Monstre() {
        super();
        this.pv = 10;
    }

    @Override
    public boolean ajouterLab(Labyrinthe lab) {
        boolean res = false;
        if(lab.getCarte()[y][x].isCaseVide()) {
            lab.getCarte()[y][x] = this;
            jeu.getMonstres().add(this);
            res = true;
        }
        return res;
    }

    @Override
    public void dessiner(Graphics2D g, int i, int i1) {
        g.setColor(Color.RED);
        g.fillOval(x * Labyrinthe.TAILLE_CASE, y * Labyrinthe.TAILLE_CASE
                , Labyrinthe.TAILLE_CASE, Labyrinthe.TAILLE_CASE);
    }
}
