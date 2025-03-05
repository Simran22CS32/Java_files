package assignment;

public class SumofDiagonal {
	public static void main(String[] args) {
		        int[][] matrix = {
		            {1, 2, -3},
		            {4, 5, 6},
		            {7, 8, -9}
		        };
		        int[] result = calculateDiagonalSums(matrix);

		        // Displaying the results
		        System.out.println("Primary diagonal sum = " + result[0]);
		        System.out.println("Secondary diagonal sum = " + result[1]);
		    }

		    public static int[] calculateDiagonalSums(int[][] matrix) {
		        int primaryDiagonalSum = 0;
		        int secondaryDiagonalSum = 0;
		        int n = matrix.length; // Assuming square matrix

		        for (int i = 0; i < n; i++) {
		            primaryDiagonalSum += matrix[i][i]; // Primary diagonal element
		            secondaryDiagonalSum += matrix[i][n - 1 - i]; // Secondary diagonal element
		        }

		        return new int[]{primaryDiagonalSum, secondaryDiagonalSum};
		    }
}

