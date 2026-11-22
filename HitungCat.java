import java.util.Scanner;

public class HitungCat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang ruangan (kaki): ");
        double panjang = input.nextDouble();
        
        System.out.print("Masukkan lebar ruangan (kaki): ");
        double lebar = input.nextDouble();
        
        System.out.print("Masukkan tinggi ruangan (kaki): ");
        double tinggi = input.nextDouble();

        // Luas dinding = 2 * (panjang * tinggi) + 2 * (lebar * tinggi)
        double luasDinding = 2 * (panjang * tinggi) + 2 * (lebar * tinggi);
        // Luas langit-langit = panjang * lebar (lantai tidak dicat)
        double luasLangitLangit = panjang * lebar;
        double totalLuas = luasDinding + luasLangitLangit;

        System.out.println("\nTotal luas permukaan yang akan dicat: " + totalLuas + " kaki persegi.");

        int sisaLuas = (int) Math.ceil(totalLuas);
        
        // Prioritas ember 5 liter ($15 untuk 1500 sq ft)
        int ember5 = sisaLuas / 1500;
        int sisaSetelah5 = sisaLuas % 1500;
        
        int ember1 = sisaSetelah5 / 300;
        if (sisaSetelah5 % 300 != 0) {
            ember1++; 
        }

        // Optimasi biaya: Jika butuh 4 atau lebih ember 1 liter, lebih baik beli 1 ember 5 liter tambahan ($15 vs $16)
        if (ember1 >= 4) {
            ember5++;
            ember1 = 0;
        }

        double totalBiaya = (ember5 * 15.0) + (ember1 * 4.0);

        System.out.println("Jumlah Ember 5 Liter (1500 sq ft): " + ember5);
        System.out.println("Jumlah Ember 1 Liter (300 sq ft): " + ember1);
        System.out.println("Total Biaya Optimal: $" + totalBiaya);

        input.close();
    }
}