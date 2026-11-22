public class Shape {
    private int numSides;
    private boolean regular;

    // Constructor 1 (Default)
    public Shape() {
        this.numSides = 4;
        this.regular = true;
    }

    // Constructor 2 (Parameterized)
    public Shape(int numSides, boolean regular) {
        this.numSides = numSides;
        this.regular = regular;
    }

    // Getter dan Setter
    public int getNumSides() { return numSides; }
    public void setNumSides(int numSides) { this.numSides = numSides; }
    public boolean isRegular() { return regular; }
    public void setRegular(boolean regular) { this.regular = regular; }

    public static void main(String[] args) {
        Shape s1 = new Shape();
        Shape s2 = new Shape(3, false);

        System.out.println("Shape 1 -> Jumlah sisi: " + s1.getNumSides() + ", Regular: " + s1.isRegular());
        System.out.println("Shape 2 -> Jumlah sisi: " + s2.getNumSides() + ", Regular: " + s2.isRegular());
    }
}