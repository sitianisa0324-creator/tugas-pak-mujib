import java.util.Scanner;

public class KalkulatorIfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan pertama (double): ");
        double num1 = input.nextDouble();
        
        System.out.print("Masukkan bilangan kedua (double): ");
        double num2 = input.nextDouble();
        
        System.out.print("Masukkan operator (+, -, *, /, %): ");
        char operator = input.next().charAt(0);
        
        double hasil = 0;
        boolean valid = true;

        if (operator == '+') {
            hasil = num1 + num2;
        } else if (operator == '-') {
            hasil = num1 - num2;
        } else if (operator == '*') {
            hasil = num1 * num2;
        } else if (operator == '/') {
            if (num2 != 0) hasil = num1 / num2;
            else { System.out.println("Error: Pembagian dengan nol!"); valid = false; }
        } else if (operator == '%') {
            if (num2 != 0) hasil = num1 % num2;
            else { System.out.println("Error: Modulus dengan nol!"); valid = false; }
        } else {
            System.out.println("Operator tidak valid!");
            valid = false;
        }

        if (valid) {
            System.out.println("Hasil: " + num1 + " " + operator + " " + num2 + " = " + hasil);
        }
        
        input.close();
    }
}