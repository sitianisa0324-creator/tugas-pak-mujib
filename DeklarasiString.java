public class DeklarasiString {
    public static void main(String[] args) {
        // Cara 1: Menggunakan string literal (paling umum dan efisien)
        String myString1 = "abc";

        // Cara 2: Menggunakan keyword 'new' secara eksplisit
        String myString2 = new String("abc");

        // Cara 3: Menggunakan array of char yang dikonversi ke String
        char[] charArray = {'a', 'b', 'c'};
        String myString3 = new String(charArray);

        // Menampilkan hasil
        System.out.println("Cara 1: " + myString1);
        System.out.println("Cara 2: " + myString2);
        System.out.println("Cara 3: " + myString3);
    }
}