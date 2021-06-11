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

public class Potion extends Declanchable {

    @Override
    public void prendrePotion(Personnage p) {
        if(!isTrouver()){
            trouver = true;
            p.diminuerPv(-5);
            if (p.getPv() > 20) {
                p.setInitPv();
            }
        }
    }

    @Override
    public void dessiner(Graphics2D g, int i, int i1) {
        if (isTrouver()) {
            try {
                BufferedImage image = ImageIO.read(new File("sprite/grass.png"));
                g.drawImage(image, i1 * Labyrinthe.TAILLE_CASE, i * Labyrinthe.TAILLE_CASE, null);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try {
                BufferedImage image = ImageIO.read(new File("sprite/potion.png"));
                g.drawImage(image, i1 * Labyrinthe.TAILLE_CASE, i * Labyrinthe.TAILLE_CASE, null);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
