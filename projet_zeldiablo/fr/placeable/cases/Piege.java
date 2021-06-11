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

/**
 * @class
 * Classe de piège héritant de Declanchable
 */

public class Piege extends Declanchable{

    /**
     * Constructeur sans paramètre
     */
    public Piege(){
        super();
    }

    /**
     * Méthode publique permettant de déclencher le piège tout en affectant l'Entite dessus
     * @param e
     *      Entite
     */
    public void declencher(Entite e) {
        if(!isTrouver()) trouver = true;
        e.diminuerPv(5);
    }

    /**
     * Méthode de dessin qui permet de dessiner le piège selon si il est trouvé ou non
     * @param g
     *      Graphics2D
     * @param i
     *      int x
     * @param i1
     *      int y
     */
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
