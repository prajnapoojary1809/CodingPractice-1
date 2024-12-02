package Problem38;

import com.sun.source.tree.BreakTree;

public class CountOfUpperCaseAndLowerCase {
    public static void main(String[] args) {
        String str = "h fkri AJD SJD";
        int[] count = countofLowercaseAndUppercase(str);
        System.out.println("Count of Lowercase: "+count[0]);
        System.out.println("Count of Uppercase: "+count[1]);
    }
    public static int[] countofLowercaseAndUppercase(String str){
        int countOfLowercase=0;
        int countOfUppercase=0;
        for(int i=0;i<str.length();i++) {
            char c = str.charAt(i);
            if(c>='a' && c<='z'){
                countOfLowercase++;
            }
            else if (c>='A' && c<='Z')
            {
                countOfUppercase++;
            }
        }return new int[] { countOfLowercase, countOfUppercase};
    }
}
