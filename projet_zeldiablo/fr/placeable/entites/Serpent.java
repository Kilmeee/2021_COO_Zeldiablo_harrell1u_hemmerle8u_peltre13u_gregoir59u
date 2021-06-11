package fr.placeable.entites;

import fr.Labyrinthe;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * @class Serpent
 * Classe qui modelise un serpent
 */
public class Serpent extends Monstre {

    /**
     *
     */
    public Serpent() {
        super();
        this.pv = 20;
        this.degats = 2;
        this.timer = 4;
    }

    /**
     *
     * @param x
     * @param y
     */
    public Serpent(int x, int y) {
        super(x, y);
        this.pv = 20;
        this.degats = 2;
        this.timer = 4;
    }

    /**
     *
     * @param g
     * @param i
     * @param i1
     */
    @Override
    public void dessiner(Graphics2D g, int i, int i1) {
        try{
            BufferedImage image = ImageIO.read(new File("sprite/fantome.png"));
            g.drawImage(image, x* Labyrinthe.TAILLE_CASE, y*Labyrinthe.TAILLE_CASE,null);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
