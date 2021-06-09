package fr.placeable.entites;

import fr.JeuZeldiablo;
import fr.Labyrinthe;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Timer;

public class Monstre extends Entite {

    public Monstre(int x, int y) {
        super(x, y);
        this.pv = 10;
    }

    public Monstre() {
        super();
        this.pv = 10;
        this.degats = 1;
    }

    /**
     *
     * @param lab
     * @return
     */
    @Override
    public boolean ajouterLab(Labyrinthe lab) {
        boolean res = super.ajouterLab(lab);
        if(res) jeu.getMonstres().add(this);
        return res;
    }

    @Override
    public void dessiner(Graphics2D g, int i, int i1) {
        try{
            BufferedImage image = ImageIO.read(new File("sprite/fantome.png"));
            g.drawImage(image, x*Labyrinthe.TAILLE_CASE, y*Labyrinthe.TAILLE_CASE,null);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
