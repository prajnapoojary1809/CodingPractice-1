package problem29;

public class NonRepeatingcharacter {
    public static void main(String[] args) {
        String str = "swiss"; // Example string
        char result = findFirstNonRepeatingChar(str);

        if (result != '\0') {
            System.out.println("First non-repeating character is: " + result);
        } else {
            System.out.println("All characters are repeating or the string is empty.");
        }
    }

    public static char findFirstNonRepeatingChar(String str) {
        int[] charCount = new int[256]; // Array to store the count of characters
        int len = str.length();

        // Fill the character count array
        for (int i = 0; i < len; i++) {
            charCount[str.charAt(i)]++;
        }

        // Find the first non-repeating character
        for (int i = 0; i < len; i++) {
            if (charCount[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }

        return '\0'; // Return null character if no non-repeating character is found
    }
}

