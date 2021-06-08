package fr.placeable.cases;

import fr.placeable.Declanchable;

public class Trigger extends Declanchable {
    public Trigger(){
        super();
    }
    @Override
    public void declencher() {
        if(!isTrouver()) trouver = true;
        System.out.println("trigger");
    }
}
