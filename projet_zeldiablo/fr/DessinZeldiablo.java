package fr;

import fr.moteurJeu.DessinJeu;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Classe permettant de représenter le jeu graphiquement en 2D
 */

public class DessinZeldiablo implements DessinJeu {

    /**
     * Constante entière qui permet de mettre la taille en pixel de chaque déplacement.
     */
    private final int TAILLE = 1;

    private JeuZeldiablo jeuZeldiablo;

    public DessinZeldiablo(JeuZeldiablo jeuZeldiablo) {
        this.jeuZeldiablo = jeuZeldiablo;
    }

    @Override
    public void dessiner(BufferedImage image) {
        Graphics2D g = (Graphics2D) image.getGraphics();
        //Création du héro
        g.setColor(Color.BLUE);
        g.fillOval(jeuZeldiablo.getPersonnage().getX() * TAILLE, jeuZeldiablo.getPersonnage().getY() * TAILLE, 10, 10);

        //Création des monstre
        g.setColor(Color.RED);
        jeuZeldiablo.getMonstres().forEach(monstre -> g.fillOval(monstre.getX() * TAILLE, monstre.getY() * TAILLE, 10, 10));
    }
}
