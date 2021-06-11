package fr.placeable;

import fr.placeable.cases.Case;
import fr.placeable.entites.Monstre;

public abstract class Traversable extends Case {

    /**
     * Test si les coordonnées de la case passée en param est vide.
     * @param x
     * @param y
     * @return
     */
    public boolean isCaseVide(int x, int y) {
        boolean vide = true;
        for (Monstre monstre : jeu.getMonstres()) {
            if (monstre.getX() == x && monstre.getY() == y) {
                vide = false;
                break;
            }
        }
        return vide;
    }

}
