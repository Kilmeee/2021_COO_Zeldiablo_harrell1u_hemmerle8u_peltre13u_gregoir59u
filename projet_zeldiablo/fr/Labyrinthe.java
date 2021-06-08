package fr;

public class Labyrinthe {

    public static int TAILLE_CASE = 50;

    private int tailleX = 100;
    private int tailleY = 60;

    private Placeable[][] carte;


    public Labyrinthe() {
        this.tailleX = 20;
        this.tailleY = 12;

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

    public int getTailleX() {
        return tailleX;
    }

    public int getTailleY() {
        return tailleY;
    }

    public void ajouterLab(Placeable placeable, int x, int y) {
        if(!(this.carte[x][y] instanceof Mur)) this.carte[x][y] = placeable;
    }
}
