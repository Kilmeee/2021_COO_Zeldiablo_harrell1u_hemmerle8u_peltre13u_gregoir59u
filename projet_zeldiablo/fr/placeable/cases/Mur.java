package fr.placeable.cases;

import fr.Labyrinthe;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Classe héritant de Case qui est un mur donc non traversable
 */

public class Mur extends Case {

    /**
     * Méthode de dessin pour dessiner graphiquement un mur
     * @param g
     *      Graphics2D
     * @param i
     *      int x
     * @param i1
     *      int y
     */

    @Override
    public void dessiner(Graphics2D g, int i, int i1) {
        try{
            BufferedImage image = ImageIO.read(new File("sprite/wall.jpg"));
            g.drawImage(image, i1* Labyrinthe.TAILLE_CASE, i*Labyrinthe.TAILLE_CASE,null);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
