package fr;

import fr.placeable.*;
import fr.placeable.cases.*;
import fr.placeable.objets.Excalibur;
import fr.placeable.objets.Potion;

public class Labyrinthe {

    public static int TAILLE_CASE = 50;

    private int tailleX;
    private int tailleY;

    private Placeable[][] carte;
    private Placeable[][] niveau2;


    public Labyrinthe() {
        this.tailleX = 20;
        this.tailleY = 12;

        CaseVide cv = new CaseVide();
        Mur mur = new Mur();
        Piege pg1 = new Piege();
        Piege pg2 = new Piege();
        Piege pg3 = new Piege();
        Potion p1 = new Potion();
        Potion p2 = new Potion();
        Potion p3 = new Potion();
        Excalibur epee = new Excalibur();
        Trigger tg = new Trigger();
        Arrivee arr = new Arrivee();
        this.carte = new Placeable[][]{
                {cv,cv,cv,cv,cv,cv,cv,cv,cv,mur,cv,cv,cv,epee,mur,cv,cv,mur,cv,cv},
                {cv,mur,mur,mur,mur,mur,mur,mur,cv,mur,cv,mur,mur,mur,mur,cv,cv,cv,cv,cv},
                {cv,cv,cv,cv,cv,cv,cv,mur,cv,mur,cv,mur,cv,cv,pg3,cv,cv,mur,cv,cv},
                {cv,mur,mur,mur,mur,mur,cv,mur,cv,mur,cv,mur,mur,mur,cv,mur,cv,mur,mur,mur},
                {cv,mur,cv,cv,cv,mur,cv,mur,cv,cv,cv,cv,cv,mur,cv,mur,cv,cv,cv,arr},
                {cv,mur,cv,mur,mur,mur,mur,mur,cv,mur,mur,mur,cv,mur,cv,mur,p2,mur,mur,mur},
                {cv,cv,cv,cv,cv,cv,cv,cv,cv,mur,mur,mur,cv,mur,mur,mur,cv,cv,cv,mur},
                {mur,cv,mur,mur,mur,mur,mur,cv,mur,mur,mur,mur,cv,mur,cv,cv,cv,mur,cv,mur},
                {cv,cv,cv,p1,mur,cv,cv,cv,mur,p3,cv,cv,cv,mur,cv,mur,mur,mur,cv,mur},
                {cv,mur,cv,cv,tg,cv,cv,cv,mur,cv,cv,cv,mur,mur,cv,mur,cv,cv,cv,mur},
                {cv,mur,cv,cv,mur,cv,mur,mur,mur,mur,cv,cv,mur,mur,mur,mur,cv,mur,pg2,mur},
                {cv,cv,cv,cv,mur,cv,cv,cv,cv,mur,cv,cv,pg1,cv,cv,cv,cv,mur,cv,cv}
        };
        this.niveau2 = new Placeable[][]{
                {cv,mur,mur,cv,cv,cv,cv,cv,mur,cv,cv,cv,cv,cv,cv,cv,mur,cv,cv,cv},
                {cv,cv,mur,cv,mur,mur,mur,cv,mur,cv,cv,mur,mur,mur,mur,cv,mur,cv,mur,cv},
                {cv,cv,mur,cv,mur,p3,mur,cv,mur,cv,cv,mur,cv,cv,mur,cv,mur,cv,mur,cv},
                {mur,cv,mur,cv,mur,cv,mur,cv,mur,mur,cv,mur,cv,cv,mur,cv,mur,cv,mur,cv},
                {mur,cv,cv,cv,mur,cv,mur,cv,cv,cv,cv,pg1,cv,cv,mur,cv,pg3,cv,mur,cv},
                {mur,mur,mur,cv,mur,cv,cv,cv,cv,cv,cv,mur,cv,cv,mur,cv,cv,cv,mur,cv},
                {cv,cv,cv,cv,mur,mur,mur,mur,mur,mur,cv,mur,cv,cv,mur,mur,mur,mur,mur,mur},
                {cv,mur,mur,cv,mur,cv,mur,p1,cv,mur,mur,mur,mur,cv,mur,cv,cv,cv,mur,cv},
                {cv,mur,mur,mur,mur,cv,mur,cv,cv,tg,cv,cv,cv,cv,cv,cv,mur,cv,mur,cv},
                {cv,mur,cv,p2,cv,cv,mur,mur,mur,cv,cv,cv,cv,cv,pg2,cv,mur,cv,mur,cv},
                {cv,mur,mur,cv,mur,cv,cv,cv,mur,mur,mur,mur,mur,mur,cv,cv,mur,cv,mur,cv},
                {cv,cv,cv,cv,mur,mur,mur,cv,mur,cv,cv,cv,cv,cv,cv,cv,mur,cv,cv,cv}
        };

    }

    public int getTailleX() {
        return tailleX;
    }

    public int getTailleY() {
        return tailleY;
    }

    public Placeable[][] getCarte(){
        return this.carte;
    }
}