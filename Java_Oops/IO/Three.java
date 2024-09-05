package IO;

import java.io.*;
import java.util.*;

public class Three {

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java FileWordCount <inputFile> <outputFile>");
            return;
        }

        String inputFile = args[0];
        String outputFile = args[1];

        // Use TreeMap to store words and their counts (sorted alphabetically)
        Map<String, Integer> wordCountMap = new TreeMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;

            // Read each line from the input file
            while ((line = reader.readLine()) != null) {
                // Split the line into words
                String[] words = line.split("\\s+");

                // Update the word counts
                for (String word : words) {
                    word = word.trim(); // Remove leading/trailing spaces
                    if (!word.isEmpty()) {
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading from input file: " + e.getMessage());
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            // Write the sorted words and their counts to the output file
            for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
                writer.write(entry.getKey() + " : " + entry.getValue());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing to output file: " + e.getMessage());
        }
    }
}
