import java.util.Scanner;

public class LuasSegitiga {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan alas segitiga: ");
        double b = scanner.nextDouble();

        System.out.print("Masukkan tinggi segitiga: ");
        double h = scanner.nextDouble();

        // Menghitung luas (menggunakan 0.5 agar tidak terjadi pembagian integer 1/2)
        double a = 0.5 * b * h;

        System.out.println("Luas segitiga adalah: " + a);
        scanner.close();
    }
}