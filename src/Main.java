import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int lineCount = 0;
        int wordCount = 0;

        try {
            File inputFile = new File("input.txt");
            Scanner fileReader = new Scanner(inputFile);

            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                lineCount++;

                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }

            fileReader.close();

            PrintWriter writer = new PrintWriter("output.txt");
            writer.println("File Processing Result");
            writer.println("Total Lines: " + lineCount);
            writer.println("Total Words: " + wordCount);
            writer.close();

            System.out.println("File processed successfully.");
            System.out.println("Output written to output.txt");

        } catch (FileNotFoundException e) {
            System.out.println("Error: input.txt file not found.");
        }
    }
}
