import moteurJeu.Commande;
import moteurJeu.Jeu;

/**
 * Classe JeuPerso qui permet de gérer le Jeu.
 */

public class JeuZeldiablo implements Jeu {

    /**
     * Attribut privé Labyrinthe qui permet de récupérer la taille de celui-ci.
     */
    private Labyrinthe labyrinthe;

    /**
     * Attribut privé Personnage qui permet de gérer le personnage en jeu.
     */
    private Personnage personnage;

    /**
     * Constructeur de base qui initialise le Jeu.
     */
    public JeuZeldiablo() {
        this.labyrinthe = new Labyrinthe();
        this.personnage = new Personnage(0, 0);
    }

    /**
     * Méthode appelée à chaque passage du MoteurGraphique et permet de faire évoluer le jeu.
     * @param commandeUser
     *      Commande, permet de gérer les commandes de l'utilisateur
     */

    @Override
    public void evoluer(Commande commandeUser) {

    }

    @Override
    public boolean etreFini() {
        return false;
    }

    public Personnage getPersonnage() {
        return personnage;
    }
}
