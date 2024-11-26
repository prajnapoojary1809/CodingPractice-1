package Problem20;

public class SumOfSquare {
    public static void main(String[] args) {
        int num=7;
        isSumOfSquare(num);
        if(isSumOfSquare(num)){
            System.out.println(num+" is sum of two squares");
        }else{
            System.out.println(num+ " is not a sum of two squares");
        }

    }
    public static boolean isSumOfSquare(int num){
        for(int i=0; i * i <=num ; i++){
            for(int j=0;j * j<=num;j++){
                if((i*i) + (j*j) ==num){
                    return true;
                }
            }
        }return false;
    }
}

