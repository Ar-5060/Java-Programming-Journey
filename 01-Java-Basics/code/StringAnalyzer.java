public class StringAnalyzer {

    static String reverse(String text) {
        char[] characters = text.toCharArray();
        int left = 0;
        int right = characters.length - 1;

        while (left < right) {
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;
            left++;
            right--;
        }

        return new String(characters);
    }

    static boolean isPalindrome(String text) {

        int left = 0;
        int right = text.length() - 1;

        while (left < right) {

            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    static int countVowels(String text) {

        int count = 0;
        text = text.toLowerCase();

        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            if (ch == 'a' || ch == 'e' ||
                ch == 'i' || ch == 'o' || ch == 'u') {

                count++;
            }
        }

        return count;
    }

    static int countWords(String text) {

        if (text.isBlank()) {
            return 0;
        }

        return text.strip().split("\\s+").length;
    }

    public static void main(String[] args) {

        String text = "Java Programming";

        System.out.println("Original: " + text);

        System.out.println("Length: " + text.length());

        System.out.println("Reverse: " + reverse(text));

        System.out.println("Vowels: " + countVowels(text));

        System.out.println("Words: " + countWords(text));

        System.out.println(
            "Palindrome: " + isPalindrome("madam")
        );
    }
}
