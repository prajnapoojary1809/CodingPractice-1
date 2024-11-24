package Problem1;

public class Factorial {
    public static void main(String[] args) {
        int number =3;
        if(number <0) {
            System.out.println("Enter a positive integer");
        }
        else {
            int result = fact(number);
        System.out.println("Problem1.Factorial of "+ number +" is: "+result);
        }
    }
    public static int fact(int number){
        if(number==1||number==0){
            return 1;
        }
         return number *fact(number-1);
    }
}

