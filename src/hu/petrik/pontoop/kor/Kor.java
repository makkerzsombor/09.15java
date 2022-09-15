package hu.petrik.pontoop.kor;

public class Kor {
    private int r;
    private int x;
    private int y;

    public Kor(int r) {
        this.r = r;
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

    public String getKorMéretezes(int szam, int sugar) {
        if (szam >= 0) {
            sugar += szam;
        } else {
            sugar += szam;
        }
        double t = Math.pow(sugar, 2) * 3.14;
        double k = 2 * sugar * 3.14;
        return "Kerület: " + k + " Terület: " + t;
    }
    public String kiiras(int p1, int p2, int r) {
        return "("  + p1 + ","+ p2 + "," + r +')';
    }
    public String getRandom(){
        int x =(int) (Math.random() * ((2 * 10) + 1)) - 10;
        int y =(int) (Math.random() * ((2 * 10) + 1)) - 10;
        int r =(int) (Math.random() * ((2 * 10) + 1));
        return "("+ x + " "+ y + " " + r + ")";
    }
}
