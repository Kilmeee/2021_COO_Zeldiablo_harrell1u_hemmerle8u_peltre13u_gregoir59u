public abstract class Entite {

    protected int x, y;

    public Entite() {
        this.x = 0;
        this.y = 0;
    }

    public Entite(int x, int y) {
        this.x = x;
        this.y = y;
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
