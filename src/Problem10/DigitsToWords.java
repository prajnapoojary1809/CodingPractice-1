package Problem10;

public class DigitsToWords {

    private static final String[] units = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
    private static final String[] teens = { "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
    private static final String[] tens = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };
    private static final String[] thousands = { "", "thousand" };

    public static void main(String[] args) {
        int num = 1121;
        System.out.println(numberToWords(num));
    }

    public static String numberToWords(int num) {
        if (num == 0) {
            return units[0];
        }

        StringBuilder words = new StringBuilder();
        int thousandIndex = 0;

        while (num > 0) {
            if (num % 1000 != 0) {
                words.insert(0, threeDigitNumberToWords(num % 1000) + thousands[thousandIndex] + " ");
            }
            num /= 1000;
            thousandIndex++;
        }

        return words.toString().trim();
    }

    private static String threeDigitNumberToWords(int num) {
        StringBuilder result = new StringBuilder();

        if (num >= 100) {
            result.append(units[num / 100]).append(" hundred ");
            num %= 100;
        }
        if (num >= 20) {
            result.append(tens[num / 10]).append(" ");
            num %= 10;
        }
        if (num >= 10 && num < 20) {
            result.append(teens[num - 10]).append(" ");
            return result.toString().trim();
        }
        if (num > 0) {
            result.append(units[num]).append(" ");
        }

        return result.toString().trim();
    }
}
