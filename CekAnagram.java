import java.util.Arrays;
import java.util.Scanner;

public class CekAnagram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kata/frasa pertama: ");
        String str1 = input.nextLine();

        System.out.print("Masukkan kata/frasa kedua: ");
        String str2 = input.nextLine();

        // Mengabaikan spasi, tanda baca, dan huruf besar/kecil
        String s1Clean = str1.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String s2Clean = str2.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        boolean isAnagram = true;

        if (s1Clean.length() != s2Clean.length()) {
            isAnagram = false;
        } else {
            char[] charArray1 = s1Clean.toCharArray();
            char[] charArray2 = s2Clean.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            isAnagram = Arrays.equals(charArray1, charArray2);
        }

        if (isAnagram) {
            System.out.println("\"" + str1 + "\" DAN \"" + str2 + "\" ADALAH ANAGRAM.");
        } else {
            System.out.println("\"" + str1 + "\" DAN \"" + str2 + "\" BUKAN ANAGRAM.");
        }

        input.close();
    }
}

