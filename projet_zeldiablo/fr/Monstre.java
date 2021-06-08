package fr;

import java.awt.*;

public class Monstre extends Entite {

    public Monstre(int x, int y, Labyrinthe lab) {
        super(x, y, lab);
        this.pv = 10;
    }

    public Monstre(Labyrinthe lab) {
        super(lab);
        this.pv = 10;
    }

    @Override
    public Color getColor() {
        return null;
    }
}
