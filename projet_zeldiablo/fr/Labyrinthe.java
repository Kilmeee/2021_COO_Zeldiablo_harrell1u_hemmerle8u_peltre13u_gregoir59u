package fr;

import fr.placeable.*;
import fr.placeable.cases.CaseVide;
import fr.placeable.cases.Mur;
import fr.placeable.cases.Piege;
import fr.placeable.cases.Trigger;
import fr.placeable.entites.Monstre;

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
        Piege pg = new Piege();
        Trigger tg = new Trigger();
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
                {cv,mur,cv,cv,tg,cv,cv,cv,mur,cv,cv,cv,mur,mur,cv,mur,cv,cv,cv,mur},
                {cv,mur,cv,cv,mur,cv,mur,mur,mur,mur,cv,cv,mur,mur,mur,mur,cv,mur,cv,mur},
                {cv,cv,cv,cv,mur,cv,cv,cv,cv,mur,cv,cv,pg,cv,cv,cv,cv,mur,cv,cv}
        };

        System.out.println(carte[0][5]);
    }

    public boolean isCaseVide(int x, int y){
        return (carte[y][x] instanceof Traversable);
    }

    public boolean isPiege(int x, int y){
        return (carte[y][x] instanceof Piege);
    }

    public boolean isTriggerCase(int x, int y){
        return (carte[y][x] instanceof Trigger);
    }


    public int getTailleX() {
        return tailleX;
    }

    public int getTailleY() {
        return tailleY;
    }

    public void ajouterLab(Placeable placeable, int x, int y, JeuZeldiablo jeu) {
        if(this.carte[y][x] instanceof CaseVide)
            this.carte[y][x] = placeable;
        if(placeable instanceof Monstre) jeu.getMonstres().add((Monstre) placeable);
    }

    public Placeable[][] getCarte(){
        return this.carte;
    }
}
