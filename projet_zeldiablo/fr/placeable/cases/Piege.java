package fr.placeable.cases;

import fr.Labyrinthe;
import fr.placeable.Declanchable;
import fr.placeable.entites.Entite;
import fr.placeable.entites.Personnage;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Piege extends Declanchable{
    public Piege(){
        super();
    }

    public void declencher(Entite e) {
        if(!isTrouver()) trouver = true;
        e.diminuerPv(5);
    }

    @Override
    public void dessiner(Graphics2D g, int i, int i1) {
        if(isTrouver()) {
            try{
                BufferedImage image = ImageIO.read(new File("sprite/piege.png"));
                g.drawImage(image, i1* Labyrinthe.TAILLE_CASE, i*Labyrinthe.TAILLE_CASE,null);
            } catch (IOException e){
                e.printStackTrace();
            }
        } else {
            try{
                BufferedImage image = ImageIO.read(new File("sprite/grass.png"));
                g.drawImage(image, i1* Labyrinthe.TAILLE_CASE, i*Labyrinthe.TAILLE_CASE,null);
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
