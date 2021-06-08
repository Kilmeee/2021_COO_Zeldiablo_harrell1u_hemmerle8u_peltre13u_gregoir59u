package fr.placeable.cases;

import java.awt.*;

public class Mur extends Case {

    @Override
    public void dessiner(Graphics2D g, int i, int i1) {
        g.setColor(Color.BLACK);
        g.fillRect(i1*50, i*50, 50, 50);
    }
}
