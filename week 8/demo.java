import java.io.*;
import java.util.*;

class demo{

    // Function to read values from a file
    void readValuesFromFile(String filePath) {
        List<Double> numbers = new ArrayList<>();

        try (BufferedReader BR = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = BR.readLine()) != null) {
                String[] words = line.split(" "); // Split line into words

                for (String word : words) {
                    try {
                        double num = Double.parseDouble(word); // Convert word to number
                        numbers.add(num);
                    } catch (NumberFormatException e) {
                        // Ignore non-numeric words
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

        // Calculate average only after reading all numbers
        if (!numbers.isEmpty()) {
            calculateAverage(numbers, "sameer.txt");
        } else {
            System.out.println("No numbers found in the file.");
        }
    }

    // Function to calculate average
    void calculateAverage(List<Double> validValues, String outputPath) {
        double sum = 0;
        for (double num : validValues) {
            sum += num;
        }

        double avg = sum / validValues.size();
        System.out.println("Average: " + avg); // Print average

        writeResultToFile(avg, outputPath);
    }

    // Function to write the average to a file
    void writeResultToFile(double average, String outputPath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath, true))) {
            writer.write("\nAverage: " + average); // Append average at the end
        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        }
    }

    // Main function
    public static void main(String[] args) {
        DataProcessor DataPro = new DataProcessor();
        DataPro.readValuesFromFile("sameer.txt"); // Input file
    }
}
