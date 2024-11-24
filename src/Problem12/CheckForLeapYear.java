package Problem12;

public class CheckForLeapYear {
    public static void main(String[] args) {
    int year=700;
    boolean isLeapYear=checkForLeapYear(year);
    if(isLeapYear) {
        System.out.println(year + "is a leap year");
    }else{
        System.out.println(year+" is not a leap year");
    }
    }
    public static boolean checkForLeapYear(int year){
        if (year%4==0){
            if(year%100==0){
                if(year%400==0){
                    return true;
                }else return false;
            }else return true;
        }else return false;
    }
}
