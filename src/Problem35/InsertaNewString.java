package Problem35;

public class InsertaNewString {
    public static void main(String[] args) {
        String original = "HelloWorld";
        String toInsert = " Beautiful ";
        String result = insertStringInMiddle(original, toInsert);

        System.out.println("Original String: " + original);
        System.out.println("String to Insert: " + toInsert);
        System.out.println("Resulting String: " + result);
    }

    public static String insertStringInMiddle(String original, String toInsert) {
        int middleIndex = original.length() / 2;
        return new StringBuilder(original).insert(middleIndex, toInsert).toString();
    }
}


