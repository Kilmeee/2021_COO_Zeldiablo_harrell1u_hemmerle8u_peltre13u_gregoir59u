package fr.iamonstre;

import fr.placeable.entites.Entite;

import java.util.Random;

public class Deplacement {

    public static Position deplacementAleatoire(Entite e) {
        Position position = new Position(e);
        int random = new Random().nextInt(4);
        if(random == 0) {
            position.setPosition(1, 0);
        } else if(random == 1) {
            position.setPosition(-1, 0);
        } else if(random == 2) {
            position.setPosition(0, 1);
        } else {
            position.setPosition(0, -1);
        }
        return position;
    }
}
