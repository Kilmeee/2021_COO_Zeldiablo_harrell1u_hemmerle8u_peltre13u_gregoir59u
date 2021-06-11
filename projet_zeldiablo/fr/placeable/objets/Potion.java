package fr.placeable.objets;

import fr.Labyrinthe;
import fr.placeable.Declanchable;
import fr.placeable.entites.Entite;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * @class Potion
 * Classe qui modelise une potion
 */
public class Potion extends Declanchable {

    /**
     *
     * @param e
     */
    @Override
    public void declencher(Entite e) {
        if(!isTrouver()) if(e.prendrePotion()) trouver = true;
    }

    /**
     *
     * @param g
     * @param i
     * @param i1
     */
    @Override
    public void dessiner(Graphics2D g, int i, int i1) {
        if (isTrouver()) {
            try {
                BufferedImage image = ImageIO.read(new File("sprite/grass.png"));
                g.drawImage(image, i1 * Labyrinthe.TAILLE_CASE, i * Labyrinthe.TAILLE_CASE, null);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try {
                BufferedImage image = ImageIO.read(new File("sprite/potion.png"));
                g.drawImage(image, i1 * Labyrinthe.TAILLE_CASE, i * Labyrinthe.TAILLE_CASE, null);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
