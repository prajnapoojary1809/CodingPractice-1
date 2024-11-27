package Problem27;

public class ReplaceSubstring {
    public static void main(String[] args) {
        String string="may be we are one";
        String target="one";
        String replacement="even";
//        String newString= string.replace("one","even");
        String newString= string.replace(target,replacement);
        System.out.println("String before replacement: "+string);
        System.out.println("String after replacement: "+newString);
    }
}
