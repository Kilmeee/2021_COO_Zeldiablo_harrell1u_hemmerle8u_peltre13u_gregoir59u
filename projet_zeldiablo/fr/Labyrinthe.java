package fr;

public class Labyrinthe {

    public static int TAILLE_CASE = 50;

    private int tailleX;
    private int tailleY;


    public Labyrinthe() {
        this.tailleX = 20;
        this.tailleY = 12;
    }

    public int getTailleX() {
        return tailleX;
    }

    public int getTailleY() {
        return tailleY;
    }
}
