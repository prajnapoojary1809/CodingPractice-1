package Problem36;

public class LengthOfString {
    public static void main(String[] args) {
        String myString = "Compiler";
        int count = 0;

        for (int i = 0; i < myString.length(); i++) {
            count++;
        }
        System.out.println("Length of the string: " + count);
    }
}

