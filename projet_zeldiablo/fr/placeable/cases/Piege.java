package fr.placeable.cases;

import fr.placeable.Declanchable;

public class Piege extends Declanchable{
    public Piege(){
        super();
    }

    @Override
    public void declencher() {
        if(!isTrouver()) trouver = true;
            System.out.println("piege");
    }
}
