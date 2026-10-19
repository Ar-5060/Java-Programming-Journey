import java.util.Arrays;

public class ArraysPractice {

    static int sum(int[] numbers) {

        int total = 0;

        for (int number : numbers) {
            total += number;
        }

        return total;
    }

    static int max(int[] numbers) {

        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return max;
    }

    static int linearSearch(int[] numbers, int target) {

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println(Arrays.toString(numbers));

        System.out.println("Sum: " + sum(numbers));

        System.out.println("Max: " + max(numbers));

        System.out.println("Index: " + linearSearch(numbers, 30));
    }
}