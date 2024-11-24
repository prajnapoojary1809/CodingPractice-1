package Problem11;

public class BinaryToDecimal {
    public static void IntegerBinaryToDecimal(int num) {
        int ans = 0, i = 0, temp = num;
        while (num != 0) {
            ans += (num % 10) * Math.pow(2, i);
            num /= 10;
            i++;
        }
        System.out.println("Decimal Equivalent of " + temp + " is " + ans);
    }
    public static void main(String[] args) {
        int num = 1010;
            IntegerBinaryToDecimal(num);
    }
}


