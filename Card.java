public class Card {
    String suit, name;
    int points;

    public Card(int n, int n2) {
        suit = getSuit(n);
        name = getName(n2);
        points = getPoints(n2);
    }

    public String toString() {
        return "The " + name + " of " + suit;
    }

    public String getName(int i) {
        switch (i) {
            case 1: return "Ace";
            case 2: return "Two";
            case 3: return "Three";
            case 4: return "Four";
            case 5: return "Five";
            case 6: return "Six";
            case 7: return "Seven";
            case 8: return "Eight";
            case 9: return "Nine";
            case 10: return "Ten";
            case 11: return "Jack";
            case 12: return "Queen";
            case 13: return "King";
            default: return "error";
        }
    }

    public int getPoints(int i) {
        if (i == 1) return 11;
        if (i >= 2 && i <= 10) return i;
        if (i >= 11 && i <= 13) return 10;
        return -1;
    }

    public String getSuit(int i) {
        switch (i) {
            case 1: return "Diamonds";
            case 2: return "Clubs";
            case 3: return "Spades";
            case 4: return "Hearts";
            default: return "error";
        }
    }
}