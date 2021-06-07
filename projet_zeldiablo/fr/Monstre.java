package fr;

public class Monstre extends Entite {

    public Monstre(int x, int y, Labyrinthe lab) {
        super(x, y, lab);
    }

    public Monstre(Labyrinthe lab) {
        super(lab);
    }

}
