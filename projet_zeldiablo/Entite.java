public abstract class Entite {

    private Labyrinthe lab;

    protected int x, y;

    public Entite(Labyrinthe lab) {
        this.x = lab.getTailleX()/2;
        this.y = lab.getTailleY()/2;
    }

    public Entite(int x, int y, Labyrinthe lab) {
        this.x = x;
        this.y = y;
        this.lab = lab;
    }

    public void deplacer(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
