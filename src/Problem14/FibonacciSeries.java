package Problem14;

public class FibonacciSeries {
    public static void main(String[] args) {
        int sum = 0;
        fibonacciSeries(sum);
    }

    public static void fibonacciSeries(int sum) {
        int n = 10;
        int a1 = 0;
        int a2 = 1;
        System.out.println("Fibonacci Series:"+"\n"+a1+"\n"+a2);
        for (int i = 0; i < n; i++) {
            sum = a1 + a2;
            a1 = a2;
            a2 = sum;
            System.out.println(sum);
        }
    }
}