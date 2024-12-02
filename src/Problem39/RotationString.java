package Problem39;

public class RotationString {
    public static void main(String[] args) {
        String str1 = "welcome";
        String str2 = "omewelc";
        if(isRotational(str1,str2)){
            System.out.println(str2+" is a rotation of "+ str1);
        }
        else{
            System.out.println(str2+" is not a rotation of "+ str1);
        }
    }

    public static boolean isRotational(String str1,String str2) {
        if (str1.length()==str2.length() && str1.length() > 0) {
            String concatenated = str1 + str1;
           return concatenated.contains(str2);
        }return false;
    }
}

