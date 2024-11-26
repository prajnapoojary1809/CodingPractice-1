package Problem14;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n=10;
        List<Integer> list=fibonacciSeries(n);
        System.out.println("Fibonacci Series:"+list);

    }

    public static List<Integer> fibonacciSeries(int n) {
        List<Integer> fibonacciList=new ArrayList<>();
        int a1 = 0;
        int a2 = 1;
            fibonacciList.add(a1);
            fibonacciList.add(a2);
        for (int i = 0; i < n; i++) {
            int sum = a1 + a2;
            fibonacciList.add(sum);
            a1 = a2;
            a2 = sum;
        }
        return fibonacciList;
    }
}