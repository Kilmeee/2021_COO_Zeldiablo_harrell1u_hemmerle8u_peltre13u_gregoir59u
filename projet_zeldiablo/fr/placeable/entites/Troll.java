package fr.placeable.entites;

import fr.Labyrinthe;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * @class Troll
 * Classe qui modelise un troll
 */
public class Troll extends Monstre {

    /**
     *
     */
    public Troll() {
        super();
        this.pv = 50;
        this.degats = 5;
        this.timer = 10;
    }

    /**
     *
     * @param x
     * @param y
     */
    public Troll(int x, int y) {
        super(x, y);
        this.pv = 50;
        this.degats = 5;
        this.timer = 10;
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
            BufferedImage image = ImageIO.read(new File("sprite/troll.png"));
            g.drawImage(image, x* Labyrinthe.TAILLE_CASE, y*Labyrinthe.TAILLE_CASE,null);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
