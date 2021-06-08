package fr;

import fr.moteurJeu.DessinJeu;
import fr.placeable.Declanchable;
import fr.placeable.cases.Mur;
import fr.placeable.cases.Piege;
import fr.placeable.cases.Trigger;

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

        for (int i = 0; i < jeuZeldiablo.getLabyrinthe().getTailleY(); i++) {
            for (int i1 = 0; i1 < jeuZeldiablo.getLabyrinthe().getTailleX(); i1++) {
                jeuZeldiablo.getLabyrinthe().getCarte()[i][i1].dessiner(g, i, i1);
            }
        }


        //Création des murs

        jeuZeldiablo.getPersonnage().dessiner(g, 0, 0);

        jeuZeldiablo.getMonstres().forEach(monstre -> monstre.dessiner(g, 0, 0));

        g.setColor(Color.BLACK);
        g.drawLine(0, 600, 1000,600);

        Font font = new Font("Serif", Font.BOLD, 18);
        g.setFont(font);
        StringBuilder textPv = new StringBuilder("Nombre de PV -->   Joueur :" + jeuZeldiablo.getPersonnage().getPv());
        for(int i = 0; i < jeuZeldiablo.getMonstres().size(); i++){
            textPv.append("   Monstre ").append((i+1)).append(" :").append(jeuZeldiablo.getMonstres().get(i).getPv());
        }
        g.drawString(textPv.toString(), 5, 615);
    }
}
