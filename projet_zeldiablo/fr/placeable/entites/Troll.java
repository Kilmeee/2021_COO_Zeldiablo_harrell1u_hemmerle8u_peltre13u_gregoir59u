package fr.placeable.entites;

import fr.Labyrinthe;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Troll extends Monstre {

    public Troll() {
        super();
        this.pv = 50;
        this.degats = 5;
        this.timer = 10;
    }

    public Troll(int x, int y) {
        super(x, y);
        this.pv = 50;
        this.degats = 5;
        this.timer = 10;
    }

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
