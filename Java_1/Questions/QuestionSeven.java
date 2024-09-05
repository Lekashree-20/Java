package Questions;

public class QuestionSeven {
    public static void main(String[] args) {
        int rows = 5;
        int[][] matrix = new int[rows][rows];

        int num = 1;
        for (int i = 0; i < rows; i++) {
            int k = i;
            for (int j = 0; j <= i; j++) {
                matrix[k--][j] = num++;
            }
        }

        for (int i = 1; i < rows; i++) {
            int k = i;
            for (int j = rows - 1; j >= i; j--) {
                matrix[j][k++] = num++;
            }
        }

        // Printing the pattern
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (matrix[i][j] != 0) {
                    System.out.printf("%-4d", matrix[i][j]);
                } else {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
    }
}
