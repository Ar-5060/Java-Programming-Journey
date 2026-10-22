public class Student {

    private int id;
    private String name;
    private double cgpa;

    private static String university = "ABC University";

    public Student(int id, String name, double cgpa) {

        this.id = id;
        this.name = name;
        setCgpa(cgpa);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {

        if (cgpa >= 0 && cgpa <= 4.0) {
            this.cgpa = cgpa;
        } else {
            throw new IllegalArgumentException("Invalid CGPA");
        }
    }

    public void displayInfo() {

        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
        System.out.println("University: " + university);
        System.out.println("-------------------");
    }
     public static void main(String[] args) {

        Student s1 = new Student(101, "Rahim", 3.75);
        Student s2 = new Student(102, "Karim", 3.90);

        s1.displayInfo();
        s2.displayInfo();

        s1.setCgpa(3.85);

        System.out.println("Updated CGPA: " + s1.getCgpa());
    }
}
