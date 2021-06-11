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
    }

    public Troll(int x, int y) {
        super(x, y);
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
