package fr;

import fr.moteurJeu.DessinJeu;
import fr.placeable.cases.Mur;

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

        //Création des murs
        g.setColor(Color.BLACK);
        for (int i = 0; i < jeuZeldiablo.getLabyrinthe().getTailleY(); i++) {
            for (int i1 = 0; i1 < jeuZeldiablo.getLabyrinthe().getTailleX(); i1++) {
                if(jeuZeldiablo.getLabyrinthe().getCarte()[i][i1] instanceof Mur)
                    g.fillRect(i1*50, i*50, 50, 50);
            }
        }
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
