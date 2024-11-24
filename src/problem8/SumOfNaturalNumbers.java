package problem8;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int n=5;
        int sum=sumOfNaturalNumbers(n);
        System.out.println(sum);
    }
    public static int sumOfNaturalNumbers(int n) {

        if (n <=1) {
            return n;
        }
        else
            return sumOfNaturalNumbers (n-1)+n;
    }
}