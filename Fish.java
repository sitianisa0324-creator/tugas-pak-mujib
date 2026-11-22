public class Fish {
    String typeOfFish;
    int friendliness;

    // Soal 2: Default constructor
    public Fish() {
        this.typeOfFish = "Unknown";
        this.friendliness = 3;
    }

    // Soal 3: Parameterized constructor
    public Fish(String t, int f) {
        this.typeOfFish = t;
        this.friendliness = f;
    }

    // Soal 5: Getter friendliness
    public int getFriendliness() {
        return friendliness;
    }

    // Soal 7: Membandingkan dua ikan
    public static Fish nicestFish(Fish f1, Fish f2) {
        return (f1.getFriendliness() >= f2.getFriendliness()) ? f1 : f2;
    }

    // Soal 8: Variable argument method (varargs)
    public static Fish nicestFish(Fish... fishes) {
        Fish temp = fishes[0];
        for (Fish f : fishes) {
            if (f.getFriendliness() > temp.getFriendliness()) {
                temp = f;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        // Soal 6: Inisialisasi 2 ikan
        Fish Amber = new Fish("AngelFish", 5);
        Fish James = new Fish("Guppy", 3);

        // Soal 9: Pengujian
        Fish palingRamah = nicestFish(Amber, James);
        System.out.println("Ikan paling ramah: " + palingRamah.typeOfFish);
    }
}