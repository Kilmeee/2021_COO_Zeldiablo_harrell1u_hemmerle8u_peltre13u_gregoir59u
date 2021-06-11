package fr.placeable.objets;

import fr.Labyrinthe;
import fr.placeable.Declanchable;
import fr.placeable.entites.Entite;
import fr.placeable.entites.Personnage;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * @class Excalibur
 * Classe qui modelise une Excalibur (epee)
 */
public class Excalibur extends Declanchable {

    @Override
    public void declencher(Entite e) {
        prendreEpee(e);
    }

    public void prendreEpee(Entite e) {
        if (!isTrouver()) {
            trouver = true;
            e.prendreEpee();
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
                BufferedImage image = ImageIO.read(new File("sprite/epee.png"));
                g.drawImage(image, i1 * Labyrinthe.TAILLE_CASE, i * Labyrinthe.TAILLE_CASE, null);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

