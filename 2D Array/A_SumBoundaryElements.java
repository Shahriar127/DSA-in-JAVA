public class A_SumBoundaryElements {

      public static int sumBoundary(int[][] matrix) {
          int sum = 0;
          int rows = matrix.length;
          int cols = matrix[0].length;
          
          // Top row
          for (int j = 0; j < cols; j++) {
              sum += matrix[0][j];
          }
          
          // Bottom row
          for (int j = 0; j < cols; j++) {
              sum += matrix[rows - 1][j];
          }
          
          // Left column (excluding corners already included)
          for (int i = 1; i < rows - 1; i++) {
              sum += matrix[i][0];
          }
          
          // Right column (excluding corners already included)
          for (int i = 1; i < rows - 1; i++) {
              sum += matrix[i][cols - 1];
          }
          
          return sum;
      }
  
      public static void main(String[] args) {
          int[][] matrix = {
              {1, 2, 3},
              {4, 5, 6},
              {7, 8, 9}
          };
          System.out.println("Sum of boundary elements: " + sumBoundary(matrix));
      }
  }