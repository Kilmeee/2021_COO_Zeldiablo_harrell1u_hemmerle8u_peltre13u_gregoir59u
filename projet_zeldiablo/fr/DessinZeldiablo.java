package fr;

import fr.moteurJeu.DessinJeu;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Classe permettant de représenter le jeu graphiquement en 2D
 */

public class DessinZeldiablo implements DessinJeu {

    private JeuZeldiablo jeuZeldiablo;

    public DessinZeldiablo(JeuZeldiablo jeuZeldiablo) {
        this.jeuZeldiablo = jeuZeldiablo;
    }

    @Override
    public void dessiner(BufferedImage image) {
        Graphics2D g = (Graphics2D) image.getGraphics();
        //Création du héro
        g.setColor(Color.BLUE);
        g.fillOval(jeuZeldiablo.getPersonnage().getX() * Labyrinthe.TAILLE_CASE, jeuZeldiablo.getPersonnage().getY() * Labyrinthe.TAILLE_CASE
                , Labyrinthe.TAILLE_CASE, Labyrinthe.TAILLE_CASE);

        //Création des monstre
        g.setColor(Color.RED);
        jeuZeldiablo.getMonstres().forEach(monstre -> g.fillOval(monstre.getX() * Labyrinthe.TAILLE_CASE, monstre.getY() * Labyrinthe.TAILLE_CASE
                , Labyrinthe.TAILLE_CASE, Labyrinthe.TAILLE_CASE));
    }
}
