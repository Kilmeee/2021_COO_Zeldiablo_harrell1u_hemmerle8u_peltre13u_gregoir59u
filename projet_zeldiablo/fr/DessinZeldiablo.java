package fr;

import fr.moteurJeu.DessinJeu;
import fr.placeable.Declanchable;
import fr.placeable.cases.Mur;
import fr.placeable.cases.Piege;
import fr.placeable.cases.Trigger;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Classe permettant de représenter le jeu graphiquement en 2D
 */

public class DessinZeldiablo implements DessinJeu {

    private JeuZeldiablo jeuZeldiablo;

    public DessinZeldiablo(JeuZeldiablo jeuZeldiablo) {
        this.jeuZeldiablo = jeuZeldiablo;
    }

    /**
     *
     * @param image
     */
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

        dessinerBarrePv(g);

        textMort(g);

        textArrive(g);
    }

    /**
     *
     * @param g
     */
    private void dessinerBarrePv(Graphics2D g){
        g.setColor(Color.BLACK);
        g.drawLine(0, 600, 1000,600);

        Font font = new Font("Serif", Font.BOLD, 18);
        g.setFont(font);
        StringBuilder textPv = new StringBuilder("Nombre de PV →   Joueur : " + jeuZeldiablo.getPersonnage().getPv());
        for(int i = 0; i < jeuZeldiablo.getMonstres().size(); i++){
            textPv.append("   Monstre ").append((i+1)).append(" : ").append(jeuZeldiablo.getMonstres().get(i).getPv());
        }
        if (jeuZeldiablo.getPersonnage().isDead()) {
            g.setColor(Color.red);
        }
        if (jeuZeldiablo.getPersonnage().isArrive()) {
            g.setColor(new Color(0,150,0));
        }
        g.drawString(textPv.toString(), 5, 615);
    }

    /**
     *
     * @param g
     */
    private void textMort(Graphics2D g) {
        if(jeuZeldiablo.getPersonnage().isDead()) {
            try{
                BufferedImage image = ImageIO.read(new File("sprite/defaite.png"));
                g.drawImage(image, 0, 0,null);
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    /**
     *
     * @param g
     */
    private void textArrive(Graphics2D g) {
        if(jeuZeldiablo.getPersonnage().isArrive())  {
            try{
                BufferedImage image = ImageIO.read(new File("sprite/victory.jpg"));
                g.drawImage(image, 0, 0,null);
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
