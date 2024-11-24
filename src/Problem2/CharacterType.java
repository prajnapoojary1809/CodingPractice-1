package Problem2;

public class CharacterType {
    public static void main(String[] args) {
        char ch='9';
        ch=Character.toLowerCase(ch);
        if(ch>='a' && ch<='z'){
            String result=checkForConsonentOrVowel(ch);
            System.out.println("Given Character is "+result);
        }
        else{
            System.out.println("Enter a character");
        }

    }
    public static String checkForConsonentOrVowel(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return "Vowel";
        }
        else return "Consonent";
    }
}