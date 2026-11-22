public class ContohTigaError {
    public static void main(String[] args) {
        System.out.println("=== CONTOH-CONTOH ERROR DALAM JAVA ===");

        /* 
         * a. SYNTAX ERROR
         * Jika Anda menulis kode seperti di bawah ini tanpa titik koma,
         * program tidak akan bisa di-compile sama sekali.
         * int angka = 10
         */

        // b. LOGIC ERROR
        // Program berjalan sukses, tapi hasil perhitungannya salah secara logika.
        int totalNilai = 90;
        int jumlahSiswa = 3;
        // Seharusnya dibagi (/), tapi keliru dikurangi (-)
        int rataRataSalah = totalNilai - jumlahSiswa; 
        System.out.println("1. Contoh Logic Error (Hasil salah): " + rataRataSalah);

        // c. EXCEPTION / RUNTIME ERROR
        // Terjadi saat program berjalan, contohnya pembagian dengan angka nol.
        int a = 10;
        int b = 0;
        
        try {
            int hasil = a / b; // Memicu ArithmeticException
            System.out.println("Hasil: " + hasil);
        } catch (ArithmeticException e) {
            System.out.println("2. Contoh Exception tertangkap: Terjadi kesalahan matematika (bagi dengan nol)!");
        }
    }
}