import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int canh1, canh2, canh3;

        while (true) {
            System.out.print("nhap canh 1: ");
            canh1 = scanner.nextInt();
            System.out.print("nhap canh 2: ");
            canh2 = scanner.nextInt();
            System.out.print("nhap canh 3: ");
            canh3 = scanner.nextInt();

            if (Tamgiac.isTamgiac(canh1, canh2, canh3)) {
                Tamgiac tamgiac = new Tamgiac(canh1, canh2, canh3);
                System.out.println("chu vi: " + tamgiac.tinhChuVi(tamgiac.canh1, tamgiac.canh2, tamgiac.canh3));
                System.out.println("dien tich: " + tamgiac.tinhDienTich(tamgiac.canh1, tamgiac.canh2, tamgiac.canh3));
                return;
            } else {
                System.out.println("Nhap sai");
            }
        }
    }
}
