package Day5;

public class Test1 {
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Create a new matrix with dimensions cols*rows
        int[][] transposedMatrix = new int[cols][rows];

        // Transpose elements from the original matrix to the transposed matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        return transposedMatrix;
    }
    
    public static int[][] reverseRows(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Reverse rows
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][cols - 1 - j];
                matrix[i][cols - 1 - j] = temp;
            }
        }

        return matrix;
    }

    public static void printArr(int[][] matrix) {
        int n1 = matrix.length;
        int n2 = matrix[0].length;
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] originalMatrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        int[][] transposedMatrix = transposeMatrix(originalMatrix);
        int[][] reversedMatrix = reverseRows(transposedMatrix);

        System.out.println("Transposed and Reversed Matrix:");
        printArr(reversedMatrix);
    }
}
