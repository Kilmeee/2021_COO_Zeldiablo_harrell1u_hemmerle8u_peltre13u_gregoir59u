import moteurJeu.MoteurGraphique;

public class MainZeldiablo {

    public static void main(String[] args) throws InterruptedException {
        JeuZeldiablo jeuZeldiablo = new JeuZeldiablo();
        DessinZeldiablo dessinZeldiablo = new DessinZeldiablo(jeuZeldiablo);

        MoteurGraphique moteurGraphique = new MoteurGraphique(jeuZeldiablo, dessinZeldiablo);

        moteurGraphique.lancerJeu(400, 400);

        System.out.println("Le jeu est fini !");
    }

}
