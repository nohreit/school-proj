package prog_2.sp22.hw6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadAndEditFile {

//private static final String OUTPUT_FILENAME = "HomeworkOutput6-2.txt";

    static boolean hasPunctuation = true;
    static Scanner into = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        readAndEditFile();
    }

    public static void readAndEditFile() {
        System.out.println("What is the name of your file:");
        String filename = into.next();

        try {
            File fileInput = new File(loadFile(filename).getFile());
            Scanner read = new Scanner(fileInput);
            File fileOutput = createFile("Homework6-2OutputFile.txt");
            FileWriter writer = new FileWriter(fileOutput);
            while (read.hasNextLine()) {
                String line = read.nextLine();
                System.out.println(line);
                writer.write(writeFile(line)); // Write the new line into the file.
            }
            read.close();
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } finally {
            readAndEditFile();
        }
    }

    public static File createFile(String filename) {
        File file = null;
        try {
            file = new File(filename);
            System.out.println(file.createNewFile() ? "\n\nFile created: " + file.getName() : "\n\nFile already exists!");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return file;
    }

    public static String writeFile(String line) {
        line = line.replaceAll(" +", " ").trim();

        Pattern pattern = Pattern.compile("[.!]");
        Matcher matcher = pattern.matcher(line);

        StringBuilder newLine = new StringBuilder();

        if (!hasPunctuation) { // if the previous line has no punctuation at the end, return the current line
            hasPunctuation = matcher.find(); // check if the current line has a punctuation;
            return line + "\n";
        }

        hasPunctuation = matcher.find(); // check if the current line has a punctuation; assign true;

        String[] words = line.split(" ");

        newLine.append(Character.toUpperCase(words[0].charAt(0))).append(words[0].substring(1)); // Uppercase the first character of the first word of the line.

        for (int i = 1; i < words.length; i++) {
            if (pattern.matcher(words[i - 1]).find()) // check if previous word has a punctuation.
                newLine.append(" ").append(Character.toUpperCase(words[i].charAt(0))).append(words[i].substring(1));
            else newLine.append(" ").append(words[i]);
        }

        return newLine + "\n";
    }

    public static URL loadFile(String filename) { // get the file
        return ReadAndEditFile.class.getResource(filename);
    }


}

