package Problem5;

import static java.lang.Math.sqrt;

public class SquareRoot {

    public static void main(String[] args) {
        int a=1,b=-2,c=1;
        double d=(b*b)-(4*a*c);
        double r=b/(2*a);
        squareRoot(10,4,-6,d,r);
    }
    public static void squareRoot(int a,int b,int c,double d,double r){
        if (d>0){
            double r1=r+(sqrt(d))/(2*a);
            double r2=r-(sqrt(d))/(2*a);
            System.out.println(r1);
            System.out.println(r2);
        }
        else if (d==0)
        {
            System.out.println("Roots are equal:"+-r);
        }else {
            System.out.println("Roots are imaginary");
        }
    }
}
