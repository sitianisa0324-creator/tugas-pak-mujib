import java.util.Scanner;

public class BeratPlanet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan berat badan Anda di Bumi (lbs): ");
        double beratBumi = input.nextDouble();

        System.out.println("\nPilih Planet Tujuan:");
        System.out.println("1. Merkurius (0.38)");
        System.out.println("2. Venus (0.91)");
        System.out.println("3. Mars (0.38)");
        System.out.println("4. Jupiter (2.36)");
        System.out.println("5. Saturnus (0.92)");
        System.out.println("6. Uranus (0.89)");
        System.out.println("7. Neptunus (1.13)");
        System.out.print("Masukkan pilihan (1-7): ");
        int pilihan = input.nextInt();

        String namaPlanet = "";
        double faktor = 0;

        switch (pilihan) {
            case 1: namaPlanet = "Mercury"; faktor = 0.38; break;
            case 2: namaPlanet = "Venus"; faktor = 0.91; break;
            case 3: namaPlanet = "Mars"; faktor = 0.38; break;
            case 4: namaPlanet = "Jupiter"; faktor = 2.36; break;
            case 5: namaPlanet = "Saturn"; faktor = 0.92; break;
            case 6: namaPlanet = "Uranus"; faktor = 0.89; break;
            case 7: namaPlanet = "Neptune"; faktor = 1.13; break;
            default:
                System.out.println("Pilihan tidak valid!");
                System.exit(0);
        }

        double beratPlanet = beratBumi * faktor;
        System.out.println("Your weight on " + namaPlanet + " is " + beratPlanet + " lbs.");
        
        input.close();
    }
}