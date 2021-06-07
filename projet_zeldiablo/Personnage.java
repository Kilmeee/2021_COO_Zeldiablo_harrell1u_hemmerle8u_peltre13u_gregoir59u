import moteurJeu.Commande;

public class Personnage extends Entite {

    /**
     * Constructeur qui défjnit la postion initiale en paramètres
     * @param x
     * @param y
     */
    public Personnage(int x, int y, Labyrinthe lab) {
        super(x, y, lab);
    }

    /**
     * Concstructeur qui définit la postion initiale par défaut au milieu du labyrinthe.
     * @param lab
     */
    public Personnage(Labyrinthe lab){
        super(lab);
    }


}
