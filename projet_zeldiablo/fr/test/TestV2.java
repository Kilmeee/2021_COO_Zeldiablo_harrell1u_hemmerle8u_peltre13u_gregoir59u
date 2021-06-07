package fr.test;

import fr.Labyrinthe;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestV2 {

    @Test
    public void test_constructeur_Labyrinthe() {
        Labyrinthe labyrinthe = new Labyrinthe();
        assertEquals(100, labyrinthe.getTailleX());
        assertEquals(60, labyrinthe.getTailleY());
    }

}
