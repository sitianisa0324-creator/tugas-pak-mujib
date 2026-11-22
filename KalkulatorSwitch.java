import java.util.Scanner;

public class KalkulatorSwitch {
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

        switch (operator) {
            case '+': 
                hasil = num1 + num2; 
                break;
            case '-': 
                hasil = num1 - num2; 
                break;
            case '*': 
                hasil = num1 * num2; 
                break;
            case '/': 
                if (num2 != 0) hasil = num1 / num2; 
                else { System.out.println("Error: Pembagian dengan nol!"); valid = false; }
                break;
            case '%': 
                if (num2 != 0) hasil = num1 % num2; 
                else { System.out.println("Error: Modulus dengan nol!"); valid = false; }
                break;
            default:
                System.out.println("Operator tidak valid!");
                valid = false;
        }

        if (valid) {
            System.out.println("Hasil: " + num1 + " " + operator + " " + num2 + " = " + hasil);
        }
        
        input.close();
    }
}