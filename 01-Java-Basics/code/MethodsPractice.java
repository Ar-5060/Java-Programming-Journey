public class MethodsPractice {

    static void greet(String name) {
        System.out.println("Hello " + name);
    }

    static int add(int a, int b) {
        return a + b;
    }

    static boolean isEven(int number) {
        return number % 2 == 0;
    }

    static int factorial(int number) {

        int result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {

        greet("Java Learner");

        System.out.println(add(10, 20));

        System.out.println(isEven(10));

        System.out.println(factorial(5));
    }
}