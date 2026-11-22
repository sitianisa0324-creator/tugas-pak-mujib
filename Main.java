import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Card> hand = new ArrayList<>();

        // Dua kartu acak awal
        for (int i = 0; i < 2; i++) {
            int suitNumber = (int) (Math.random() * 4.0 + 1);
            int faceNumber = (int) (Math.random() * 13.0 + 1);
            hand.add(new Card(suitNumber, faceNumber));
        }

        int totalPoints = calculateTotalPoints(hand);
        printHand(hand, totalPoints);

        // Loop tambah kartu hingga poin > 21, user berhenti, atau total kartu == 5
        while (totalPoints <= 21 && hand.size() < 5) {
            System.out.print("Apakah Anda ingin kartu lagi? (y/n): ");
            String choice = scanner.nextLine().trim().toLowerCase();

            if (!choice.equals("y") && !choice.equals("ya")) {
                break;
            }

            int suitNumber = (int) (Math.random() * 4.0 + 1);
            int faceNumber = (int) (Math.random() * 13.0 + 1);
            hand.add(new Card(suitNumber, faceNumber));

            totalPoints = calculateTotalPoints(hand);
            printHand(hand, totalPoints);
        }

        scanner.close();
    }

    private static int calculateTotalPoints(ArrayList<Card> hand) {
        int sum = 0;
        for (Card c : hand) sum += c.points;
        return sum;
    }

    private static void printHand(ArrayList<Card> hand, int totalPoints) {
        System.out.println("\nKartu di Hand (" + hand.size() + " kartu):");
        for (Card c : hand) System.out.println("- " + c);
        System.out.println("Total poin: " + totalPoints);
    }
}