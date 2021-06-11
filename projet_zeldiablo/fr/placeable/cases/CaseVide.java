package fr.placeable.cases;

import fr.Labyrinthe;
import fr.placeable.Traversable;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * @class
 * Classe héritant de Traversable qui est une case qui peut être traversée
 */

public class CaseVide extends Traversable {

    /**
     * Méthode de dessin qui affiche la case vide
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
            BufferedImage image = ImageIO.read(new File("sprite/grass.png"));
            g.drawImage(image, i1* Labyrinthe.TAILLE_CASE, i*Labyrinthe.TAILLE_CASE,null);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
