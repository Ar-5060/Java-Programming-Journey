public class LoopsPractice {

    public static void main(String[] args) {

        // For Loop
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // While Loop
        int j = 1;

        while (j <= 5) {
            System.out.println(j);
            j++;
        }

        // Do-While Loop
        int k = 1;

        do {
            System.out.println(k);
            k++;
        } while (k <= 5);

        // Break
        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                break;
            }

            System.out.println(i);
        }

        // Continue
        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                continue;
            }

            System.out.println(i);
        }
    }
}