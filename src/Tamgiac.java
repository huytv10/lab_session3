public class Tamgiac {
    int canh1;
    int canh2;
    int canh3;

    public Tamgiac() {
    }

    public Tamgiac(int canh1, int canh2, int canh3) {
        this.canh1 = canh1;
        this.canh2 = canh2;
        this.canh3 = canh3;
    }

    public static boolean isTamgiac(int a, int b, int c) {
        return (a + b > c && b + c > a && a + c > b);
    }

    public int tinhChuVi(int a, int b, int c) {
        return a + b + c;

    }

    public double tinhDienTich(int a, int b, int c) {
        double p = (a + b + c) / 2;
        double s;
        s = (double) Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }
}
