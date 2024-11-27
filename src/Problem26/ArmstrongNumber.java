package Problem26;
import java.lang.*;
import java.util.*;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 154;
        if(num<=0){
            System.out.println("Enter positive number");// Example number to check
        }
        else if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int num) {
        int originalNum = num;
        List<Integer> digits = new ArrayList<>();
        int count = 0;

        // Extract digits and count the number of digits
        while (num > 0) {
            digits.add(num % 10);
            num = num / 10;
            count++;
        }

        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, count);
        }

        return sum == originalNum;
    }
}

