package fr.placeable.cases;

import fr.placeable.Declanchable;
import fr.placeable.entites.Entite;
import fr.placeable.entites.Personnage;

import java.awt.*;

public class Piege extends Declanchable{
    public Piege(){
        super();
    }

    public void declencher(Entite e) {
        if(!isTrouver()) trouver = true;
        if(e.getPv() - 5 <= 0) {
            e.setPv(0);
        }else {
            e.diminuerPv(5);
        }
    }

    @Override
    public void dessiner(Graphics2D g, int i, int i1) {
        if(isTrouver()) {
            g.setColor(new Color(222,184,135));
            g.fillRect(i1*50, i*50, 50, 50);
        }
    }
}
