package Problem22;

public class SumOfDigits {
    public static void main(String[] args) {
        int num = 4758;
        System.out.println("Sum:"+sumOfDigits(num));
    }
    public static int sumOfDigits(int num){
        int result;
        int sum = 0;
        while(num>=9){
             result=num%10;
             sum=sum+result;
             num=num/10;
        }
        return sum;
    }
}
