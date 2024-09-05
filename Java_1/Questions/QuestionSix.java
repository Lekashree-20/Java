package Questions;

// 1    2    4    7    11   
// 3    5    8    12        
// 6    9    13
// 10   14
// 15

public class QuestionSix {
    public static void main(String[] args) {
        int n = 5; // Size of the pattern
        int number = 1; // Starting number

        // Create an array to store the numbers
        int[][] pattern = new int[n][n];

        // Fill the array with the pattern numbers
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                pattern[j][i - j] = number++;
            }
        }

        // Print the pattern
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (pattern[i][j] != 0) {
                    System.out.printf("%-5d", pattern[i][j]);
                } else {
                    System.out.print("     "); // 5 spaces for alignment
                }
            }
            System.out.println();
        }
    }
}

