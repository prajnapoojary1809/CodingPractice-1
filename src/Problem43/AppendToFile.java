package Problem43;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

    public class AppendToFile {
        public static void main(String[] args) {
            String filePath = "example.txt";
            String textToAppend = "This is the text to append.";

            try {
                appendToFile(filePath, textToAppend);
                System.out.println("Text appended successfully!");
            } catch (IOException e) {
                System.out.println("An error occurred while appending the text.");
                e.printStackTrace();
            }
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


