package fr.iamonstre;

import fr.placeable.entites.Entite;

import java.util.Random;

/**
 * Classe utilitaire qui permet de récupérer une position aléatoire selon la position d'une entité en y ajoutant ou retirant un x ou y
 */

public class DeplacementUtil {

    /**
     * Constructeur privé qui permet de ne pas utiliser cette classe comme un objet, mais comme une classe utilitaire avec une méthode statique
     */

    private DeplacementUtil(){
    }

    /**
     * Méthode publique statique qui permet de récupérer un déplacement aléatoire selon la position d'une entité en y ajoutant ou retirant un x ou y
     * @param e
     *      Entite
     * @return
     *      Position
     */

    public static Position deplacementAleatoire(Entite e) {
        Position position = new Position(e);
        int random = new Random().nextInt(4);
        if(random == 0) {
            position.setPosition(1, 0);
        } else if(random == 1) {
            position.setPosition(-1, 0);
        } else if(random == 2) {
            position.setPosition(0, 1);
        } else {
            position.setPosition(0, -1);
        }
        return position;
    }
}
