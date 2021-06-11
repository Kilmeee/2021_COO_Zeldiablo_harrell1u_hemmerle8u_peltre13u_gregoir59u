package fr.placeable.cases;

import fr.Labyrinthe;
import fr.placeable.Declanchable;
import fr.placeable.entites.Entite;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * @class
 * Classe héritant de Declanchable qui permet de créer la case d'arrivée
 */

public class Arrivee extends Declanchable {

    /**
     * Constructeur sans paramètre
     */

    public Arrivee() {
        super();
    }

    /**
     * Méthode publique qui permet de déclencher la victoire du jeu
     * @param e
     *      Entite qui marche sur la case
     */

    public void declencher(Entite e) {
        if(!isTrouver()) trouver = true;
        e.gagne();
    }

    /**
     * Méthode de dessin qui permet d'afficher la case selon si elle a été trouvé ou pas
     * @param g
     *      Graphics2D
     * @param i
     *      int x
     * @param i1
     *      int y
     */

    public void dessiner(Graphics2D g, int i, int i1) {
        if(isTrouver()) {
            try{
                BufferedImage image = ImageIO.read(new File("sprite/arrivee.png"));
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
