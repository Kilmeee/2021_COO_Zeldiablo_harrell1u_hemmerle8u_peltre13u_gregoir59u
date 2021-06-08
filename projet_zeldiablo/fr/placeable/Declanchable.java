package fr.placeable;

public abstract class Declanchable extends Traversable {

    protected boolean trouver;

    public Declanchable(){
        trouver = false;
    }

    public boolean isTrouver(){
        return trouver;
    }
}
