package fr.placeable.entites;

import fr.Labyrinthe;
import fr.moteurJeu.Commande;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Personnage extends Entite {

    private boolean arrive;

    /**
     * Constructeur qui défjnit la postion initiale en paramètres
     * @param x
     *      int
     * @param y
     *      int
     */
    public Personnage(int x, int y) {
        super(x, y);
        this.pv = 20;
        this.arrive = false;
        this.maxPv = 20;
    }

    /**
     * Concstructeur qui définit la postion initiale par défaut au milieu du labyrinthe.
     */
    public Personnage(){
        super();
        this.pv = 20;
        this.arrive = false;
        this.maxPv = 20;
    }

    @Override
    public boolean ajouterJeu(Labyrinthe lab) {
        jeu.ajouterPersonnage(this);
        return super.ajouterJeu(lab);
    }

    public void attaquer(Commande c){
        jeu.getMonstres().forEach(monstre -> {
            if (c.attaquer && (((monstre.getX() == x+1 || monstre.getX() == x-1) && monstre.getY() == y)
                    || ((monstre.getY() == y+1 || monstre.getY() == y-1) && monstre.getX() == x))){
                monstre.diminuerPv(this.degats);
            }
        });
    }

    @Override
    public void dessiner(Graphics2D g, int i, int i1) {
        if(this.isDead()) {
            g.setColor(Color.darkGray);
        }else{
            try{
                BufferedImage image = ImageIO.read(new File("sprite/perso.png"));
                g.drawImage(image, x*Labyrinthe.TAILLE_CASE, y*Labyrinthe.TAILLE_CASE,null);
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
    public boolean isArrive() {return this.arrive; }

    @Override
    public void gagne() {
        this.arrive = true;
    }

    @Override
    public void prendreEpee() {
        this.degats = 5;
    }

    @Override
    public void prendrePotion() {
        ajouterPv(5);
    }
}
