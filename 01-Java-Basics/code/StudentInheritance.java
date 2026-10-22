public class StudentInheritance extends Person {

    private String studentId;
    private double cgpa;

    public StudentInheritance(String name, int age,
                   String studentId, double cgpa) {

        super(name, age);

        this.studentId = studentId;
        this.cgpa = cgpa;
    }

    @Override
    public void displayInfo() {

        super.displayInfo();

        System.out.println("Student ID: " + studentId);
        System.out.println("CGPA: " + cgpa);
    }
}