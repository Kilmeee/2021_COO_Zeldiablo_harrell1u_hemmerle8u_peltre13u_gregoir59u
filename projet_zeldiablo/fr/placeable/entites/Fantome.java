package fr.placeable.entites;

import fr.Labyrinthe;
import fr.iamonstre.Deplacement;
import fr.iamonstre.Position;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Fantome extends Monstre {

    public Fantome() {
        super();
        this.pv = 10;
        this.degats = 1;
        this.timer = 3;
    }

    public Fantome(int x, int y) {
        super(x, y);
        this.pv = 10;
        this.degats = 1;
        this.timer = 3;
    }

    @Override
    public void dessiner(Graphics2D g, int i, int i1) {
        try{
            BufferedImage image = ImageIO.read(new File("sprite/fantome.png"));
            g.drawImage(image, x* Labyrinthe.TAILLE_CASE, y*Labyrinthe.TAILLE_CASE,null);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void deplacer() {
        Position position = Deplacement.deplacementAleatoire(this);
        int posX = position.getX();
        int posY = position.getY();
        int i = 0;
        while(posX >= lab.getTailleX() || posX < 0 || posY >= lab.getTailleY() || posY < 0 ||
                (posX == jeu.getPersonnage().getX() && posY == jeu.getPersonnage().getY())) {
            position = Deplacement.deplacementAleatoire(this);
            posX = position.getX();
            posY = position.getY();
            if(i > 4) return;
            i++;
        }
        this.x = posX;
        this.y = posY;
        lab.getCarte()[y][x].declencher(this);
    }
}
