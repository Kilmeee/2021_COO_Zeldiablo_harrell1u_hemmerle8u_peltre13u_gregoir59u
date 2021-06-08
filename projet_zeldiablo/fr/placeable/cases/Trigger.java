package fr.placeable.cases;

import fr.placeable.Declanchable;
import fr.placeable.entites.Entite;

import java.awt.*;

public class Trigger extends Declanchable {

    public Trigger(){
        super();
    }

    @Override
    public void declencher(Entite e) {
        if(!isTrouver()) trouver = true;
        System.out.println("trigger");
    }

    @Override
    public void dessiner(Graphics2D g, int i, int i1) {
        if(isTrouver()) {
            g.setColor(Color.GRAY);
            g.fillRect(i1*50, i*50, 50, 50);
        }
    }
}
