package Problem17;

import java.util.*;

public class PrimeNumbers {
    public static void main(String[] args) {
        int N=100;

        List<Integer> list= methodFactors(N);
        System.out.println(list);

    }
    public static List<Integer> methodFactors(int N){
        List<Integer> primeList=new ArrayList<>();
        for(int i=2;i<=N;i++){//iterate through all numbers
            boolean isPrime=true;
            for(int j=2;j<=i/2;j++){// check for prime number
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                primeList.add(i);
            }
        }
        return primeList;
    }
}
