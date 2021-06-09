package fr.placeable.entites;

import fr.Labyrinthe;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Personnage extends Entite {


    /**
     * Constructeur qui défjnit la postion initiale en paramètres
     * @param x
     * @param y
     */
    public Personnage(int x, int y) {
        super(x, y);
        this.pv = 20;
    }

    /**
     * Concstructeur qui définit la postion initiale par défaut au milieu du labyrinthe.
     */
    public Personnage(){
        super();
        this.pv = 20;
    }


    @Override
    public void dessiner(Graphics2D g, int i, int i1) {
        if(this.isDead()) {
            g.setColor(Color.darkGray);
        }else{
            try{
                BufferedImage image = ImageIO.read(new File("sprite/perso.png"));
                g.drawImage(image, x*Labyrinthe.TAILLE_CASE, y*Labyrinthe.TAILLE_CASE,null);
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
