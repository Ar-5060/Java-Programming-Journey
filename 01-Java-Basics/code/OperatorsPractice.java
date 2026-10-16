public class OperatorsPractice {

    public static void main(String[] args) {

        int a = 20;
        int b = 6;

        // Arithmetic
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Remainder: " + (a % b));

        // Relational
        System.out.println(a > b);
        System.out.println(a == b);

        // Logical
        boolean condition = a > 10 && b < 10;
        System.out.println(condition);

        // Increment
        int x = 5;

        System.out.println(x++);
        System.out.println(++x);

        // Ternary
        String result = a % 2 == 0 ? "Even" : "Odd";

        System.out.println(result);
    }
}