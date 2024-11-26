package Problem21;

public class CheckForCube {
    public static void main(String[] args) {
        int num = 343;
        checkForCube(num);
        if(num==checkForCube(num))
        {
            System.out.println(num+" is a perfect cube");
        }else{
            System.out.println(num+" is not a perfect cube");
        }

    }
    public static int checkForCube(int num){
        int result=(int) Math.cbrt(num);
        return result*result*result;
    }
}
