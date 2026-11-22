public class Student {
    // Variable / Instance Fields
    String fName = "Lisa";
    String lName = "Palombo";
    int stuId = 123456789;
    String stuStatus = "Active";

    // Method untuk menampilkan info mahasiswa
    public void displayInfo() {
        System.out.println("Student Name: " + fName + " " + lName);
        System.out.println("Student ID: " + stuId);
        System.out.println("Student Status: " + stuStatus);
    }
}