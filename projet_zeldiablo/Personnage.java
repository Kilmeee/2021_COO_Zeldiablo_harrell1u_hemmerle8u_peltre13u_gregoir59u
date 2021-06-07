import moteurJeu.Commande;

public class Personnage extends Entite {

    private Labyrinthe labyrinthe;

    /**
     * Constructeur qui défjnit la postion initiale en paramètres
     * @param x
     * @param y
     * @param lab
     */
    public Personnage(int x, int y, Labyrinthe lab) {
        super(x, y);
        this.labyrinthe = lab;
    }

    /**
     * Concstructeur qui définit la postion initiale par défaut au milieu du labyrinthe.
     * @param lab
     */
    public Personnage(Labyrinthe lab){
        super(lab.getTailleX()/2, lab.getTailleY()/2 );
        this.labyrinthe = lab;
    }

    /**
     * Méthode deplacer qui consiste à déplacer le personnage en fonction du paramètre Commande.
     * @param direction
     */
    public void deplacer(Commande direction){
        if (direction.haut){
            this.y--;
        } else if (direction.bas){
            this.y++;
        } else if (direction.gauche){
            this.x--;
        } else if (direction.droite){
            this.x++;
        }
    }
}
