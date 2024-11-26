package Problem23;

public class NumberOfSquareBetweentwoNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 50;
        System.out.println("Number of squares between "+ a +" and "+ b + " is: "+countOfSquares(a,b));
    }
    public static int countOfSquares(int a,int b){
        int count =0;
        for(int i=a;i<=b;i++){
            int result=(int) Math.sqrt(i);
            if(result*result==i){
                count++;
            }
        }
        return count;
    }
}
