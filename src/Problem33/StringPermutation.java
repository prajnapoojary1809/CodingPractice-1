package Problem33;

public class StringPermutation {
    public static void main(String[] args) {
        String str = "ABC";
        System.out.println("Permutations of " + str + ":");
        generatePermutations(str, "");
    }
    public static void generatePermutations(String str, String prefix) {
        int n = str.length();
        if (n == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < n; i++) {
                generatePermutations(str.substring(0, i) + str.substring(i + 1, n), prefix + str.charAt(i));
            }
        }
    }
}


