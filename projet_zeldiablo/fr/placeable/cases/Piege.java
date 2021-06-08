package fr.placeable.cases;

import fr.placeable.Declanchable;

import java.awt.*;

public class Piege extends Declanchable{
    public Piege(){
        super();
    }

    @Override
    public void declencher() {
        if(!isTrouver()) trouver = true;
            System.out.println("piege");
    }

    @Override
    public void dessiner(Graphics2D g, int i, int i1) {
        if(isTrouver()) {
            g.setColor(new Color(222,184,135));
            g.fillRect(i1*50, i*50, 50, 50);
        }
    }
}
