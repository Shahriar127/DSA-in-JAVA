public class B_SumDiagonalElements {
      public static int sumDiagonals(int[][] matrix) {
            int sum = 0;
            int n = matrix.length;
            
            for (int i = 0; i < n; i++) {
                sum += matrix[i][i];
                sum += matrix[i][n - i - 1]; 
            }
            
            
            if (n % 2 != 0) {
                sum -= matrix[n / 2][n / 2];
            }
            
            return sum;
        }
    
        public static void main(String[] args) {
            int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
            System.out.println("Sum of diagonal elements: " + sumDiagonals(matrix));
        }
}
