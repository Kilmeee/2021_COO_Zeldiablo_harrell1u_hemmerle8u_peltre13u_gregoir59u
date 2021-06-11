package fr.placeable.entites;

import fr.Labyrinthe;
import fr.moteurJeu.Commande;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * @class Personnage
 * Classe qui modelise un personnage
 */
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

    /**
     * Méthode permettant d'ajouter un personnage au jeu
     * @param lab
     *      Labyrinthe
     * @return
     *      boolean
     */
    @Override
    public boolean ajouterJeu(Labyrinthe lab) {
        jeu.ajouterPersonnage(this);
        return super.ajouterJeu(lab);
    }

    /**
     * Méthode permettant d'attaquer à la commande E sur tous les monstres se trouvant à 1 cases du joueur
     * @param c
     *      Commande
     */
    public void attaquer(Commande c){
        jeu.getMonstres().forEach(monstre -> {
            if (c.attaquer && (((monstre.getX() == x+1 || monstre.getX() == x-1) && monstre.getY() == y)
                    || ((monstre.getY() == y+1 || monstre.getY() == y-1) && monstre.getX() == x))){
                monstre.diminuerPv(this.degats);
            }
        });
    }

    /**
     * Méthode publique permettant de dessiner le personnage
     * @param g
     *      Graphics2D
     * @param i
     *      int x
     * @param i1
     *      int y
     */
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

    /**
     * Getter permettant de savoir si le joueur a fini ou non
     * @return
     *      boolean
     */
    public boolean isArrive() {return this.arrive; }

    /**
     * Méthode publique permettant de gagner le jeu
     */
    @Override
    public void gagne() {
        this.arrive = true;
    }

    /**
     * Méthode publique permettant de prendre l'épée lorsque l'on marche dessus
     * @return
     *      boolean
     */
    @Override
    public boolean prendreEpee() {
        this.degats = 8;
        return true;
    }

    /**
     * Méthode publique permettant de prendre la potion lorsque l'on marche dessus
     * @return
     *      boolean
     */
    @Override
    public boolean prendrePotion() {
        ajouterPv(5);
        return true;
    }
}
