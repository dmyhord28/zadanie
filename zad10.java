class Student {
    String imie;

    public Student(String imie) {
        this.imie = imie;
    }
}

public class zad10 {
    public static void main(String[] args) {
        Student[] grupa = new Student[3];
        grupa[0] = new Student("Jan");
        grupa[1] = new Student("Kasia");
        grupa[2] = new Student("Tomek");

        for (Student s : grupa) {
            System.out.println("Student: " + s.imie);
        }
    }
}