package fr.placeable;

import fr.placeable.cases.Case;

public abstract class Declanchable extends Case implements Traversable {
    protected boolean trouver;

    public Declanchable(){
        trouver = false;
    }
    public abstract void declencher();

    public boolean isTrouver(){
        return trouver;
    }
}
