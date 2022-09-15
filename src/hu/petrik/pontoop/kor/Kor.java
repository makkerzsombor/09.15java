package hu.petrik.pontoop.kor;

import hu.petrik.pontoop.pont.Pont;

public class Kor {
    private int r;
    private int x;
    private int y;

    public Kor(int r) {
        this.r = r;
        //Pont p2 = new Pont(0, 0);
        this.x = 0;
        this.y = 0;
    }

    public Kor(int r, int x, int y) {
        this.r = r;
        this.x = x;
        this.y = y;
    }

    public double getKorKerulete(int r) {
        return 2 * r * 3.14;
    }

    public double getKorTerulete(int r) {
        return Math.pow(r, 2) * 3.14;
    }

}
