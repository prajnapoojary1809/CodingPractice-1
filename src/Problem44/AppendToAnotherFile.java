package Problem44;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AppendToAnotherFile {
    public static void main(String[] args) {
        String filePath = "example.txt";
        String textToAppend = "Hello";
        String additionalText = "oWorld";
        String combinedText = appendAndOmitDuplicates(textToAppend, additionalText);
        try {
            appendToFile(filePath, combinedText);
            System.out.println("Text appended successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred while appending the text.");
            e.printStackTrace();
        }
    }

    public static String appendAndOmitDuplicates(String first, String second) {
        if (first.charAt(first.length() - 1) == second.charAt(0)) {
            return first + second.substring(1);
        }
        return first + second;
    }
    public static void appendToFile(String filePath, String textToAppend) throws IOException {
        FileWriter fileWriter = new FileWriter(filePath, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        bufferedWriter.write(textToAppend);
        bufferedWriter.newLine();

        bufferedWriter.close();
        fileWriter.close();
    }
}


