package fr.placeable.entites;

import fr.Labyrinthe;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public abstract class Monstre extends Entite {

    public Monstre(int x, int y) {
        super(x, y);
        this.pv = 10;
        this.degats = 1;
    }

    public Monstre() {
        super();
        this.pv = 10;
        this.degats = 1;
    }

    /**
     *
     * @param lab
     *      Labyrinthe
     * @return
     *      boolean
     */
    @Override
    public boolean ajouterLab(Labyrinthe lab) {
        boolean res = super.ajouterLab(lab);
        if(res) jeu.getMonstres().add(this);
        return res;
    }

    public void attaquer() {
        Personnage personnage = jeu.getPersonnage();
        if(((personnage.getX() == x+1 || personnage.getX() == x-1) && personnage.getY() == y)
                || ((personnage.getY() == y+1 || personnage.getY() == y-1) && personnage.getX() == x)) {
            personnage.diminuerPv(this.degats);
            System.out.println(this.degats);
        }
    }

    @Override
    public void dessiner(Graphics2D g, int i, int i1) {
        try{
            BufferedImage image = ImageIO.read(new File("sprite/fantome.png"));
            g.drawImage(image, x*Labyrinthe.TAILLE_CASE, y*Labyrinthe.TAILLE_CASE,null);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
