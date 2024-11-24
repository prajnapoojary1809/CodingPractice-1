package Problem13;

public class GcdOfTwoNumbers {
    public static void main(String[] args) {

    int num1= 24;
    int num2=30;
    int gcd= gcdOfTwoNumbers(num1,num2);
        System.out.println("gcd of "+num1+" and " +num2+" is: "+gcd);
    }
    public static int gcdOfTwoNumbers(int num1,int num2){
        if(num2==0)
        {
        return num1;
        }else{
            return gcdOfTwoNumbers(num2,num1%num2);
        }
    }
}
