package Problem7;

public class SumOfDigits {
    public static void main(String[] args) {
        int num=567;
        int sum=sum(num);
        System.out.println(sum);
    }
    public static int sum(int num){
        int sum=0;
        while(num>0){
            sum=sum+num%10;
            num=num/10;
        }
    return sum;
    }
}
