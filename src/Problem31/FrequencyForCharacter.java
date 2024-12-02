package Problem31;

import java.util.HashMap;
import java.util.Map;

public class FrequencyForCharacter {
    public static void main(String[] args) {
        String str = "example"; // Example string
        Map<Character, Integer> frequencyMap = getCharacterFrequency(str);
        System.out.println("Character frequencies:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<Character, Integer> getCharacterFrequency(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }
        return charCountMap;
    }
}


