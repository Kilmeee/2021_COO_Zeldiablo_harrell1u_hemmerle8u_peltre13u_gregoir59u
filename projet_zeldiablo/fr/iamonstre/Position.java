package fr.iamonstre;

import fr.placeable.entites.Entite;

public class Position {

    private int x, y;
    Position(Entite e) {
        this.x = e.getX();
        this.y = e.getY();
    }

    void setPosition(int x, int y) {
        this.x += x;
        this.y += y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
