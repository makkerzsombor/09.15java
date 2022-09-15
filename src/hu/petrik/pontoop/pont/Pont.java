package hu.petrik.pontoop.pont;

public class Pont {
    private int x;
    private int y;

    public Pont(int n) {
        this.x = (int) (Math.random() * ((2 * n) + 1)) - n;
        this.y = (int) (Math.random() * ((2 * n) + 1)) - n;
    }

    public Pont() {
        this.x = 0;
        this.y = 0;
    }

    public Pont(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getOrigotolMertTavolsag() {
        return Math.sqrt((Math.pow(this.x, 2) + Math.pow(this.y, 2)));
    }

    @Override
    public String toString() {
        //return "(" + + x + + y +')';
        return String.format("(%d, %d)", this.x, this.y);
    }

    public double getTavolsag(int a1, int a2, int b1, int b2) {
        return Math.sqrt(Math.pow(b1 - a1, 2) + Math.pow(b2 - a2, 2));
    }


}
