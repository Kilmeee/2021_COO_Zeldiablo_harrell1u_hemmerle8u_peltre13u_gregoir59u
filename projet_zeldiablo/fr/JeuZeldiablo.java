package fr;

import fr.moteurJeu.Commande;
import fr.moteurJeu.Jeu;

/**
 * Classe JeuPerso qui permet de gérer le Jeu.
 */

public class JeuZeldiablo implements Jeu {

    /**
     * Attribut privé fr.Labyrinthe qui permet de récupérer la taille de celui-ci.
     */
    private Labyrinthe labyrinthe;

    /**
     * Attribut privé fr.Personnage qui permet de gérer le personnage en jeu.
     */
    private Personnage personnage;

    /**
     * Constructeur de base qui initialise le Jeu.
     */
    public JeuZeldiablo() {
        this.labyrinthe = new Labyrinthe();
        this.personnage = new Personnage(labyrinthe);
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
}
