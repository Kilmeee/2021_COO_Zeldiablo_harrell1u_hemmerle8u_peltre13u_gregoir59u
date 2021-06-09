package fr.placeable.cases;

import fr.Labyrinthe;
import fr.placeable.Declanchable;
import fr.placeable.entites.Entite;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Trigger extends Declanchable {

    public Trigger(){
        super();
    }

    @Override
    public void declencher(Entite e) {
        if(!isTrouver()) trouver = true;
        System.out.println("Case déclencheur");
    }

    @Override
    public void dessiner(Graphics2D g, int i, int i1) {
        if(isTrouver()) {
            g.setColor(Color.GRAY);
            g.fillRect(i1*50, i*50, 50, 50);

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
