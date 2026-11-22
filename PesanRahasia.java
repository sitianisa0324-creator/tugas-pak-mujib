import java.util.Scanner;

public class PesanRahasia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String pesanHasil = "";
        int jumlahAngkaTervalidasi = 0;

        System.out.println("Masukkan 10 angka rahasia satu per satu:");

        while (jumlahAngkaTervalidasi < 10) {
            System.out.print("Masukkan angka ke-" + (jumlahAngkaTervalidasi + 1) + ": ");
            int angka = input.nextInt();
            char huruf = ' ';
            boolean valid = true;

            switch (angka) {
                case 1: huruf = 'D'; break;
                case 2: huruf = 'W'; break;
                case 3: huruf = 'E'; break;
                case 4: huruf = 'L'; break;
                case 5: huruf = 'H'; break;
                case 6: huruf = 'O'; break;
                case 7: huruf = 'R'; break;
                default:
                    valid = false;
                    System.out.println("Angka belum terpecahkan! Silakan masukkan angka baru.");
            }

            if (valid) {
                pesanHasil += huruf;
                jumlahAngkaTervalidasi++;
            }
        }

        System.out.println("\nPesan rahasia yang berhasil diuraikan: " + pesanHasil);
        input.close();
    }
}
