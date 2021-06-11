package fr.placeable.entites;

import fr.Labyrinthe;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Fantome extends Monstre {

    public Fantome() {
        super();
        this.pv = 10;
        this.degats = 1;
        this.timer = 3;
    }

    public Fantome(int x, int y) {
        super(x, y);
        this.pv = 10;
        this.degats = 1;
        this.timer = 3;
    }

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
