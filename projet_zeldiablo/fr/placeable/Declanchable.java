package fr.placeable;

public abstract class Declanchable extends Traversable {

    protected boolean trouver;

    /**
     *
     */
    public Declanchable(){
        trouver = false;
    }

    /**
     *
     * @return
     */
    @Override
    public boolean isTrouver(){
        return trouver;
    }
}
