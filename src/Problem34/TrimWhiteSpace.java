package Problem34;

public class TrimWhiteSpace {
    public static void main(String[] args) {
        String str = " Hello World! Welcome to Java. ";
        String result = removeWhitespace(str);
        System.out.println("Original String: \"" + str + "\"");
        System.out.println("String without whitespace: \"" + result + "\"");
    }
    public static String removeWhitespace(String str) {
        return str.replaceAll("\\s", "");
    }
}