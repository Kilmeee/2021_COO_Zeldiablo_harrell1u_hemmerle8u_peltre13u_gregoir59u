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
        Case [][] lab {
            {-,-,-,-,-,-,-,-,-,-,-,-,-mur--mur--},
            {-murmurmurmurmurmurmur-mur-murmurmurmur-----},
            {-------mur-mur-mur-----mur--},
            {-murmurmurmurmur-mur-mur-murmurmur-mur-murmurmur},
            {-mur---mur-mur-----mur-mur----},
            {-mur-murmurmurmurmur-murmurmur-mur-mur-murmurmur},
            {---------murmurmur-murmurmur---mur},
            {mur-murmurmurmurmur-murmurmurmur-mur---mur-mur},
            {----mur---mur----mur-murmurmur-mur},
            {-mur------mur---murmur-mur---mur},
            {-mur--mur-murmurmurmur--murmurmurmur-mur-mur},
            {----mur----mur-------mur--},
        }
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
