package fr.placeable;

public abstract class Declanchable extends Traversable {

    protected boolean trouver;

    public Declanchable(){
        trouver = false;
    }

    @Override
    public boolean isTrouver(){
        return trouver;
    }
}
