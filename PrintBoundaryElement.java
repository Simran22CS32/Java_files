package assignment;

public class PrintBoundaryElement {

	public static void main(String[] args) {
		        int[][] matrix = {
		            {1, 2, 3, 4},
		            {5, 6, 7, 8},
		            {9, 10, 11, 12},
		            {13, 14, 15, 16}
		        };
		        printBoundaryElements(matrix);
		    }

		    public static void printBoundaryElements(int[][] matrix) {
		        int rows = matrix.length;
		        int cols = matrix[0].length;

		        // Print the first row (excluding the first element)
		        for (int i = 1; i < cols; i++) {
		            System.out.print(matrix[0][i] + " ");
		        }

		        // Print the last column (excluding the first and last rows)
		        for (int i = 1; i < rows; i++) {
		            System.out.print(matrix[i][cols - 1] + " ");
		        }

		        // Print the last row (in reverse order, excluding the last element)
		        if (rows > 1) {
		            for (int i = cols - 2; i >= 0; i--) {
		                System.out.print(matrix[rows - 1][i] + " ");
		            }
		        }

		        // Print the first column (in reverse order, excluding the first and last rows)
		        if (cols > 1) {
		            for (int i = rows - 2; i > 0; i--) {
		                System.out.print(matrix[i][0] + " ");
		            }
		        }

		        System.out.println(); // To move to the next line after printing boundary elements
		    }
		}
