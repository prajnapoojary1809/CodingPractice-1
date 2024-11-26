package Problem19;

public class CheckForSquare {
    public static void main(String[] args) {
        int N = 1024;
        int sum = digitSum(N);
        int rem = digitSum(sum);
        if (rem == 1 || rem == 4 || rem == 7 || rem == 9) {
            System.out.println(N+" is a square number");
        } else {
            System.out.println(N+" is not a square number");
        }
    }

    public static int digitSum(int N) {
        int sum = 0;
        while (N > 0) {
            sum = sum + (N % 10);
            N = N / 10;
        }return sum;
    }
}

//        int number = 1024;
//        if (isPerfectSquare(number)) {
//            System.out.println(number + " is a perfect square.");
//        } else {
//            System.out.println(number + " is not a perfect square.");
//        }
//    }
//
//    public static boolean isPerfectSquare(int number) {
//        if (number < 0) {
//            return false;
//        }
//        int sqrt = (int) Math.sqrt(number);
//        return sqrt * sqrt == number;


