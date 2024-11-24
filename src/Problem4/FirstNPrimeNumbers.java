package Problem4;

    public class FirstNPrimeNumbers {
        public static void main(String[] args) {
            int count=0;
            int num=2;
            int n=10;
            boolean isPrime;

            while(count<10){
                isPrime=true;
                for(int i=2;i<=num/2;i++){
                    if(num%i==0){
                        isPrime=false;
                        break;
                    }
                }
                if(isPrime){
                    System.out.println(num);
                    count++;
                }num++;
            }
        }
    }

