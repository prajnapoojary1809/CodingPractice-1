package Problem37;

public class RemoveNonAlphabet {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello, World! 123");

        StringBuilder result = removeNonAlphabetCharacters(str);
        System.out.println("Original String: \"" + str + "\"");
        System.out.println("String with only alphabets: \"" + result + "\"");
    }

    public static StringBuilder removeNonAlphabetCharacters(StringBuilder str) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
                result.append(c);
            }
        }
        return result;
    }
}