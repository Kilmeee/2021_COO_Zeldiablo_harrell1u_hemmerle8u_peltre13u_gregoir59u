package fr;

import fr.moteurJeu.Commande;
import fr.moteurJeu.Jeu;
import fr.placeable.entites.Monstre;
import fr.placeable.entites.Personnage;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe JeuPerso qui permet de gérer le Jeu.
 */

public class JeuZeldiablo implements Jeu {

    /**
     * Attribut privé fr.Labyrinthe qui permet de récupérer la taille de celui-ci.
     */
    private Labyrinthe labyrinthe;

    /**
     * Attribut privé fr.placeable.entites.Personnage qui permet de gérer le personnage en jeu.
     */
    private Personnage personnage;

    private List<Monstre> monstres;

    /**
     * Constructeur de base qui initialise le Jeu.
     */
    public JeuZeldiablo() {
        this.labyrinthe = new Labyrinthe();
        this.personnage = new Personnage(labyrinthe);
        monstres = new ArrayList<>();

        labyrinthe.ajouterLab(new Monstre(3, 4, labyrinthe), 3, 4, this);
        labyrinthe.ajouterLab(new Monstre(5, 6, labyrinthe), 5, 6, this);
    }

    /**
     * Méthode appelée à chaque passage du MoteurGraphique et permet de faire évoluer le jeu.
     * @param commandeUser
     *      Commande, permet de gérer les commandes de l'utilisateur
     */

    @Override
    public void evoluer(Commande commandeUser) {
        personnage.deplacer(commandeUser);
    }

    @Override
    public boolean etreFini() {
        return false;
    }

    public Personnage getPersonnage() {
        return personnage;
    }

    public List<Monstre> getMonstres() {
        return monstres;
    }

    public Labyrinthe getLabyrinthe() {
        return labyrinthe;
    }
}
