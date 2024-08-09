public class C_TransposeMatrix {
      public static int[][] transpose(int[][] matrix) {
            int rows = matrix.length;
            int cols = matrix[0].length;
            int[][] transposed = new int[cols][rows];
            
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    transposed[j][i] = matrix[i][j];
                }
            }
            
            return transposed;
        }
    
        public static void main(String[] args) {
            int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
            };
            int[][] transposed = transpose(matrix);
            for (int[] row : transposed) {
                for (int num : row) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
}
