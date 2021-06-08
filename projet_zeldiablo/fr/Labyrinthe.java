package fr;

public class Labyrinthe {

    public static int TAILLE_CASE = 50;

    private int tailleX;
    private int tailleY;

    private Placeable[][] carte;


    public Labyrinthe() {
        this.tailleX = 20;
        this.tailleY = 12;

        CaseVide cv = new CaseVide();
        Mur mur = new Mur();
        this.carte = new Placeable[][]{
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
                {cv,cv,cv,cv,mur,cv,cv,cv,cv,mur,cv,cv,cv,cv,cv,cv,cv,mur,cv,cv}
        };

        System.out.println(carte[0][5]);
    }

    public int getTailleX() {
        return tailleX;
    }

    public int getTailleY() {
        return tailleY;
    }

    public void ajouterLab(Placeable placeable, int x, int y) {
        if(this.carte[x][y] instanceof CaseVide) this.carte[x][y] = placeable;
    }
}
