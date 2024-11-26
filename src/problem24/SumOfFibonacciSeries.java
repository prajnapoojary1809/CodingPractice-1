package problem24;

import java.util.ArrayList;
import java.util.List;

public class SumOfFibonacciSeries {
    public static void main(String[] args) {
        int n = 10;
    List<Integer> fibonacciList=fibonacciSeries(n);
    System.out.println("fibonacci list: "+fibonacciList);

    int evenSumIndices=sumOfFibonacciSeries(fibonacciList);
        System.out.println("sum of fibonacci series at even idndices :"+evenSumIndices);
    }

    public static int sumOfFibonacciSeries(List<Integer> fibboList){
        int sum=0;
            for (int i = 0; i < fibboList.size(); i +=2) {
                sum+=fibboList.get(i);
        }
            return sum;
    }
    public static List<Integer> fibonacciSeries(int n){
        List<Integer> fibboList=new ArrayList<>();
        int a1 = 0;
        int a2 = 1;
        fibboList.add(a1);
        fibboList.add(a2);
        for(int i=1 ; i<=n ; i++){
            int sum=a1+a2;
            fibboList.add(sum);
            a1=a2;
            a2=sum;
        }
        return fibboList;
    }

}
