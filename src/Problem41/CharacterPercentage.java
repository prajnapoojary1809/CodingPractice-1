package Problem41;

public class CharacterPercentage {
    public static void main(String[] args) {
        String str = "Hello, World! 123";
        calculatePercentage(str);
    }

    public static void calculatePercentage(String str) {
        int length = str.length();
        int upperCaseCount = 0;
        int lowerCaseCount = 0;
        int digitCount = 0;
        int specialCharCount = 0;

        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                upperCaseCount++;
            } else if (Character.isLowerCase(c)) {
                lowerCaseCount++;
            } else if (Character.isDigit(c)) {
                digitCount++;
            } else {
                specialCharCount++;
            }
        }

        double upperCasePercentage = (upperCaseCount * 100.0) / length;
        double lowerCasePercentage = (lowerCaseCount * 100.0) / length;
        double digitPercentage = (digitCount * 100.0) / length;
        double specialCharPercentage = (specialCharCount * 100.0) / length;

        System.out.println("Percentage of uppercase letters: " + upperCasePercentage + "%");
        System.out.println("Percentage of lowercase letters: " + lowerCasePercentage + "%");
        System.out.println("Percentage of digits: " + digitPercentage + "%");
        System.out.println("Percentage of special characters: " + specialCharPercentage + "%");
    }
}

