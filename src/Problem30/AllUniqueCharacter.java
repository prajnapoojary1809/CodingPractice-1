package Problem30;

import java.util.HashSet;

public class AllUniqueCharacter {
    public static void main(String[] args) {
        String str = "swibhfj";
        boolean result = uniquecharacter(str);

        if (result) {
            System.out.println("All character in a string is Unique ");
        } else {
            System.out.println("There are duplicate characters in this string");
        }
    }

    public static boolean uniquecharacter(String str) {
        HashSet<Character> charSet=new HashSet<>();
        for (char c : str.toCharArray()) {
            if(!charSet.add(c)){
                return false;
            }
        }

        return true;
    }
}