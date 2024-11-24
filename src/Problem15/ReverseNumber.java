package Problem15;

public class ReverseNumber {
    public static void main(String[] args) {
    int num=567;
    int rem=0;
    int reversedNum=reverseNumber(num,rem);
        System.out.println("Reversed Number is: "+reversedNum);
    }

    public static int reverseNumber(int num,int rem){
    int reverse=0;

    while(num>0){
        rem=num%10;
        reverse=reverse*10+rem;
        num=num/10;
    }
    return reverse;
    }
}
