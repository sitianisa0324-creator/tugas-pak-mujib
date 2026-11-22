public class Student71 {
    private String name;
    private int credits;
    private double gpa;
    private int qualityPoints;

    public Student71(String name, int credits, int qualityPoints) {
        this.name = name;
        this.credits = credits;
        this.qualityPoints = qualityPoints;
        this.gpa = calculateGPA();
    }

    // 4a. Mengembalikan nilai rata-rata indeks prestasi saat ini
    public double calculateGPA() {
        if (credits == 0) return 0.0;
        return (double) qualityPoints / credits;
    }

    // 4b. Memperbarui kredit, poin mutu, dan IP
    public void addCreditsAndPoints(int newCredits, int newQualityPoints) {
        this.credits += newCredits;
        this.qualityPoints += newQualityPoints;
        this.gpa = calculateGPA();
    }

    @Override
    public String toString() {
        return String.format("Nama: %s | Kredit: %d | Poin Mutu: %d | IP: %.2f",
                name, credits, qualityPoints, gpa);
    }

    public static void main(String[] args) {
        // Soal 5
        Student71 s1 = new Student71("Mary Jones", 14, 46);
        Student71 s2 = new Student71("John Stiner", 60, 173);
        Student71 s3 = new Student71("Ari Samala", 31, 69);

        System.out.println("=== Data Awal ===");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        // Soal 6: Tambah 13 kredit dan 52 poin mutu ke Ari Samala
        s3.addCreditsAndPoints(13, 52);

        System.out.println("\n=== Setelah Ari Samala Ditambah Kredit & Poin Mutu ===");
        System.out.println(s3);
    }
}