package Problem9;

public class PowerOfaNumber {
        public static void main(String[] args) {
            int base = 3;
            int exponent = 4;
            long result = power(base, exponent);
            System.out.println(base + "^" + exponent + " = " + result);
        }

        public static long power(int base, int exponent) {
            long result = 1;
            while (exponent != 0) {
//                result=result*base;
                result *= base;
                --exponent;
            }
            return result;
        }
    }


