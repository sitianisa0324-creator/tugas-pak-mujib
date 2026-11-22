import java.util.Scanner;

public class DemoPenangananError {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM DEMO PENANGANAN ERROR (EXCEPTION) ===");
        
        try {
            System.out.print("Masukkan angka pembilang (integer): ");
            int pembilang = input.nextInt();

            System.out.print("Masukkan angka penyebut (integer): ");
            int penyebut = input.nextInt();

            // Potensi ArithmeticException jika penyebut bernilai 0
            int hasil = pembilang / penyebut;
            System.out.println("Hasil pembagian: " + hasil);

        } catch (ArithmeticException e) {
            // Menangkap error pembagian dengan nol
            System.out.println("Error Terdeteksi: Tidak dapat membagi angka dengan nol (0)!");
        } catch (Exception e) {
            // Menangkap error umum lainnya (misal input huruf alih-alih angka)
            System.out.println("Error Terdeteksi: Masukan input tidak valid! Harap masukkan angka bulat.");
        } finally {
            System.out.println("Blok finally dijalankan: Program selesai memproses.");
            input.close();
        }
    }
}