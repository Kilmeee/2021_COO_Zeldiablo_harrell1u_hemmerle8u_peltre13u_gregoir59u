package fr;

public class Labyrinthe {

    public static int TAILLE_CASE = 50;

    private int taillemur = 100;
    private int tailleY = 60;


    public Labyrinthe() {
        CaseVide cv = new CaseVide();
        Mur mur = new Mur();
        Placeable[][] lab = new Placeable[][]{
                {cv,cv,cv,cv,cv,cv,cv,cv,cv,mur,cv,cv,cv,cv,mur,cv,cv,mur,cv,cv},
                {cv,mur,mur,mur,mur,mur,mur,mur,cv,mur,cv,mur,mur,mur,mur,cv,cv,cv,cv,cv},
                {cv,cv,cv,cv,cv,cv,cv,mur,cv,mur,cv,mur,cv,cv,cv,cv,cv,mur,cv,cv},
                {cv,mur,mur,mur,mur,mur,cv,mur,cv,mur,cv,mur,mur,mur,cv,mur,cv,mur,mur,mur},
                {cv,mur,cv,cv,cv,mur,cv,mur,cv,cv,cv,cv,cv,mur,cv,mur,cv,cv,cv,cv},
                {cv,mur,cv,mur,mur,mur,mur,mur,cv,mur,mur,mur,cv,mur,cv,mur,cv,mur,mur,mur},
                {cv,cv,cv,cv,cv,cv,cv,cv,cv,mur,mur,mur,cv,mur,mur,mur,cv,cv,cv,mur},
                {mur,cv,mur,mur,mur,mur,mur,cv,mur,mur,mur,mur,cv,mur,cv,cv,cv,mur,cv,mur},
                {cv,cv,cv,cv,mur,cv,cv,cv,mur,cv,cv,cv,cv,mur,cv,mur,mur,mur,cv,mur},
                {cv,mur,cv,cv,cv,cv,cv,cv,mur,cv,cv,cv,mur,mur,cv,mur,cv,cv,cv,mur},
                {cv,mur,cv,cv,mur,cv,mur,mur,mur,mur,cv,cv,mur,mur,mur,mur,cv,mur,cv,mur},
                {cv,cv,cv,cv,mur,cv,cv,cv,cv,mur,cv,cv,cv,cv,cv,cv,cv,mur,cv,cv},
        };
    }

    public int getTaillemur() {
        return taillemur;
    }

    public int getTailleY() {
        return tailleY;
    }
}
