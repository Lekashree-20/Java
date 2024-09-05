package AbPacEx.ExceptionHandling.Third3;

import java.util.Scanner;

public class Main {

    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            for (int i = 1; i <= 2; i++) {
                try {
                    // Taking input for student name
                    System.out.print("Enter the name of student " + i + ": ");
                    String name = scanner.nextLine();
    
                    // Taking input for marks in 3 subjects
                    int[] marks = new int[3];
                    for (int j = 0; j < 3; j++) {
                        System.out.print("Enter marks for subject " + (j + 1) + ": ");
                        String input = scanner.nextLine();
                        
                        // Handle potential NumberFormatException
                        marks[j] = Integer.parseInt(input);
    
                        // Throw custom exceptions if necessary
                        if (marks[j] < 0) {
                            throw new NegativeValueException("Marks cannot be negative: " + marks[j]);
                        }
                        if (marks[j] > 100) {
                            throw new MarksOutOfRangeException("Marks should be between 0 and 100: " + marks[j]);
                        }
                    }
    
                    // Calculate and print the average
                    double average = calculateAverage(marks);
                    System.out.println("Average marks for " + name + ": " + average);
    
                } catch (NumberFormatException e) {
                    System.out.println("Error: Please enter valid integer numbers for marks.");
                    i--; // Retry for the same student
                } catch (NegativeValueException | MarksOutOfRangeException e) {
                    System.out.println("Error: " + e.getMessage());
                    i--; // Retry for the same student
                }
            }
    
            scanner.close();
        }
    
        // Method to calculate the average of an array of integers
        private static double calculateAverage(int[] marks) {
            int sum = 0;
            for (int mark : marks) {
                sum += mark;
            }
            return (double) sum / marks.length;
        }
    }