import java.util.Scanner;

public class RataRataTes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] nilaiTes = new double[5];
        double total = 0;

        System.out.println("Masukkan 5 nilai tes (maksimal 100 poin):");
        for (int i = 0; i < nilaiTes.length; i++) {
            System.out.print("Tes ke-" + (i + 1) + ": ");
            nilaiTes[i] = input.nextDouble();
            total += nilaiTes[i];
        }

        double rataRata = total / nilaiTes.length;
        System.out.println("\nTotal Nilai: " + total);
        System.out.println("Rata-rata nilai mahasiswa adalah: " + rataRata);

        input.close();
    }
}