public abstract class Entite {

    private int x, y;

    public Entite(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void deplacer(int x, int y) {
        this.x = x;
        this.y = y;
    }

}
