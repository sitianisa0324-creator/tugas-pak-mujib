public class InisialisasiMatrix {
    public static void main(String[] args) {
        long[][] matrix = new long[4][3];
        
        // Mengisi semua nilai dengan angka 5 menggunakan nested loop
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 3; j++) {
                matrix[i][j] = 5;
            }
        }
        
        // Menampilkan matriks
        System.out.println("Matriks 4x3 berisi angka 5:");
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}