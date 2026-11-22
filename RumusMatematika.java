public class RumusMatematika {
    public static void main(String[] args) {
        // Deklarasi dummy variabel agar kode bisa dikompilasi
        double x = 3.0, y = 2.0, z = 4.0;

        // a. a = akar(x^5 - 6) / 4
        double a = Math.sqrt(Math.pow(x, 5) - 6) / 4;

        // b. b = x^y - 6^x
        double b = Math.pow(x, y) - Math.pow(6, x);

        // c. c = 4 * cos(z/5) - sin(x^2)
        double c = 4 * Math.cos(z / 5) - Math.sin(Math.pow(x, 2));

        // d. d = x^4 - akar(6x - y^3)
        double d = Math.pow(x, 4) - Math.sqrt(6 * x - Math.pow(y, 3));

        // e. e = 1 / (y - 1 / (x - 2^y))
        double e = 1 / (y - 1 / (x - Math.pow(2, y)));

        // f. f = 7 * (cos(akar(5 - sin(akar(3x - 4)))))
        double f = 7 * (Math.cos(Math.sqrt(5 - Math.sin(Math.sqrt(3 * x - 4)))));

        System.out.println("Hasil a: " + a);
        System.out.println("Hasil b: " + b);
        System.out.println("Hasil c: " + c);
        System.out.println("Hasil d: " + d);
        System.out.println("Hasil e: " + e);
        System.out.println("Hasil f: " + f);
    }
}