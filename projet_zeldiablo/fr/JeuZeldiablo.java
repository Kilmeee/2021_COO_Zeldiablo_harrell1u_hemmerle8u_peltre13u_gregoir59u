package fr;

import fr.moteurJeu.Commande;
import fr.moteurJeu.Jeu;
import fr.placeable.Placeable;
import fr.placeable.entites.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Classe JeuPerso qui permet de gérer le Jeu.
 */

public class JeuZeldiablo implements Jeu {

    /**
     * Attribut privé fr.Labyrinthe qui permet de récupérer la taille de celui-ci.
     */
    private Labyrinthe labyrinthe;

    private boolean fini;

    /**
     * Attribut privé fr.placeable.entites.Personnage qui permet de gérer le personnage en jeu.
     */
    private Personnage personnage;

    private List<Monstre> monstres;

    private int timer;

    private Random r;

    /**
     * Constructeur de base qui initialise le Jeu.
     */
    public JeuZeldiablo() {
        this.labyrinthe = new Labyrinthe();
        monstres = new ArrayList<>();
        Placeable.setup(this, labyrinthe);

        timer = 0;
        this.r = new Random();
        this.fini = false;

        Personnage personnage = new Personnage();

        personnage.ajouterJeu(labyrinthe);

        nouveauMonstre().ajouterJeu(labyrinthe);
        nouveauMonstre().ajouterJeu(labyrinthe);
        nouveauMonstre().ajouterJeu(labyrinthe);
        nouveauMonstre().ajouterJeu(labyrinthe);
        nouveauMonstre().ajouterJeu(labyrinthe);
        nouveauMonstre().ajouterJeu(labyrinthe);
    }

    /**
     * Méthode appelée à chaque passage du MoteurGraphique et permet de faire évoluer le jeu.
     * @param commandeUser
     *      Commande, permet de gérer les commandes de l'utilisateur
     */

    @Override
    public void evoluer(Commande commandeUser) {
        personnage.deplacer(commandeUser);
        personnage.attaquer(commandeUser);
        for(int i = 0; i < monstres.size(); i++){
            Monstre monstre = monstres.get(i);
            if(monstre.isDead()) monstres.remove(monstre);
            else monstre.evoluer(timer);
        }
        timer++;
        if(personnage.isDead() || personnage.isArrive()) {
            this.fini = true;
        }
    }

    /**
     *
     * @return
     */
    @Override
    public boolean etreFini() {
        return fini;
    }

    /**
     *
     * @return
     */
    public List<Monstre> getMonstres() {
        return monstres;
    }

    /**
     *
     * @return
     */
    public Labyrinthe getLabyrinthe() {
        return labyrinthe;
    }

    /**
     *
     * @return
     */
    public Personnage getPersonnage() {
        return personnage;
    }

    /**
     *
     * @return
     */
    public Monstre nouveauMonstre() {
        Monstre res;
        int x = r.nextInt(20);
        int y = r.nextInt(12);
        while(!labyrinthe.getCarte()[y][x].isCaseVide(x, y)) {
            x = r.nextInt(20);
            y = r.nextInt(12);
        }
        int random = r.nextInt(3);
        if(random > 1) {
            res = new Fantome(x, y);
        } else if (random > 0) {
            res = new Serpent(x, y);
        } else {
            res = new Troll(x, y);
        }
        return res;
    }

    /**
     *
     * @param personnage
     */
    public void ajouterPersonnage(Personnage personnage) {
        this.personnage = personnage;
    }
}
