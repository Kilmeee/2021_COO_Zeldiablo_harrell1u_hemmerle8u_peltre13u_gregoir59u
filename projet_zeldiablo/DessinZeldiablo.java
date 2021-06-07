import moteurJeu.DessinJeu;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Classe permettant de représenter le jeu graphiquement en 2D
 */

public class DessinZeldiablo implements DessinJeu {

    /**
     * Constante entière qui permet de mettre la taille en pixel de chaque déplacement.
     */
    private final int TAILLE = 2;

    private JeuZeldiablo jeuZeldiablo;

    public DessinZeldiablo(JeuZeldiablo jeuZeldiablo) {
        this.jeuZeldiablo = jeuZeldiablo;
    }

    @Override
    public void dessiner(BufferedImage image) {
        Graphics2D g = (Graphics2D) image.getGraphics();
        g.setColor(Color.RED);
        g.fillOval(jeuZeldiablo.getPersonnage().getX() * TAILLE, jeuZeldiablo.getPersonnage().getY() * TAILLE, 10, 10);
    }
}
