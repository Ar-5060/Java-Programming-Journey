public class Teacher extends Person {

    private String subject;

    public Teacher(String name, int age, String subject) {

        super(name, age);

        this.subject = subject;
    }

    @Override
    public void displayInfo() {

        super.displayInfo();

        System.out.println("Subject: " + subject);
    }

    public static void main(String[] args) {

        Person student = new StudentInheritance(
                "Rahim", 22, "CSE101", 3.85);

        Person teacher = new Teacher(
                "Karim", 35, "Java Programming");

        System.out.println("Student Information:");
        student.displayInfo();

        System.out.println();

        System.out.println("Teacher Information:");
        teacher.displayInfo();
    }
}