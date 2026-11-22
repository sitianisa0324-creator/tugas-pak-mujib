public class LatihanString {
    public static void main(String[] args) {
        // --- SOAL 1 ---
        System.out.println("--- SOAL 1 ---");
        String myString1 = "abc";
        String myString2 = new String("abc");
        char[] charArray = {'a', 'b', 'c'};
        String myString3 = new String(charArray);
        
        System.out.println(myString1);
        System.out.println(myString2);
        System.out.println(myString3);

        // --- SOAL 2 ---
        System.out.println("\n--- SOAL 2 ---");
        String s1 = "ABC"; 
        String s2 = new String("DEF"); 
        String s3 = "AB" + "C"; 

        System.out.println("a. s1.compareTo(s2): " + s1.compareTo(s2));
        System.out.println("b. s2.equals(s3): " + s2.equals(s3));
        System.out.println("c. s3 == s1: " + (s3 == s1));
        System.out.println("d. s2.compareTo(s3): " + s2.compareTo(s3));
        System.out.println("e. s3.equals(s1): " + s3.equals(s1));

        // --- SOAL 3 ---
        System.out.println("\n--- SOAL 3 ---");
        String kata1 = "Belajar";
        String kata2 = "Pemrograman";
        String kata3 = kata1 + " " + kata2;
        System.out.println("String ketiga: " + kata3);
    }
}