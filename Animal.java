public class Animal {
    int weight, height;
    double speed;

    public Animal() {
        weight = 50;
        height = 4;
        speed = 2; // miles per hour
    }

    public Animal(int w, int h, int s) {
        weight = w;
        height = h;
        speed = s;
    }

    public double getTime(double miles) {
        return miles / speed;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public double getSpeed() {
        return speed;
    }

    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal(120, 6, 15);

        System.out.println("Animal #1 memiliki kecepatan " + animal1.getSpeed());
        System.out.println("Animal #2 memiliki kecepatan " + animal2.getSpeed());
    }
}