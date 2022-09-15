package hu.petrik.pontoop.pont;

public class Pont {
    private int x;
    private int y;

    public Pont(int n){
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

    @Override
    public String toString() {
        //return "(" + + x + + y +')';
        return String.format("(%d, %d)", this.x, this.y);
    }
}
