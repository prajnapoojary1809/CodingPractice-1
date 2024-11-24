package Problem6;

public class AddingTwoFractions {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;
        int den1 = 0;
        int den2 = 6;
        String result = addingTwoFractions(num1, num2, den1, den2);
//        String sum= addingTwoFractions(num1,num2,den1,den2);
//        if(den1==den2) {
        System.out.println(result);
//        }
//        else {
//            System.out.println(sum);
//        }
    }

    public static String addingTwoFractions(int num1, int num2, int den1, int den2) {
        if (den1 >0 && den2 > 0) {
            if (den1 == den2) {
                int num = num1 + num2;
                int den = den1;
                return num + "/" + den;
            } else {
                int lcm = lCM(den1, den2);
                int numerator1 = num1 * (lcm / den1);
                int numerator2 = num2 * (lcm / den2);
                int numerator = numerator1 + numerator2;
                return numerator + "/" + lcm;
            }
        }return "Division not possible";
    }
        public static int lCM ( int den1, int den2){
            return (den1 * den2) / findGCD(den1, den2);
        }

        public static int findGCD ( int den1, int den2){
            if (den2 == 0) {
                return den1;
            }
            return findGCD(den2, den1 % den2);
        }
    }
