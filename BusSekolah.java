import java.util.Scanner;

public class BusSekolah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah orang yang mendaftar: ");
        int totalOrang = scanner.nextInt();

        int kapasitasBus = 45;

        // Jumlah bus yang terisi penuh (pembagian integer)
        int jumlahBus = totalOrang / kapasitasBus;

        // Sisa orang yang harus naik van (menggunakan operator modulus %)
        int orangNaikVan = totalOrang % kapasitasBus;

        System.out.println("Jumlah bus yang diperlukan: " + jumlahBus);
        System.out.println("Total orang yang harus naik van: " + orangNaikVan);

        scanner.close();
    }
}