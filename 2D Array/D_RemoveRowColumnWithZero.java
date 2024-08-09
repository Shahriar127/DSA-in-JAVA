import java.util.ArrayList;
import java.util.List;

public class D_RemoveRowColumnWithZero {
       public static int[][] removeZeroRowColumn(int[][] matrix) {
        List<Integer> rowsToRemove = new ArrayList<>();
        List<Integer> colsToRemove = new ArrayList<>();
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    if (!rowsToRemove.contains(i)) rowsToRemove.add(i);
                    if (!colsToRemove.contains(j)) colsToRemove.add(j);
                }
            }
        }
        
        
        int newRowCount = rows - rowsToRemove.size();
        int newColCount = cols - colsToRemove.size();
        int[][] newMatrix = new int[newRowCount][newColCount];
        
        int newRow = 0;
        for (int i = 0; i < rows; i++) {
            if (rowsToRemove.contains(i)) continue;
            
            int newCol = 0;
            for (int j = 0; j < cols; j++) {
                if (colsToRemove.contains(j)) continue;
                newMatrix[newRow][newCol++] = matrix[i][j];
            }
            newRow++;
        }
        
        return newMatrix;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 0, 3},
            {4, 5, 6},
            {0, 8, 9}
        };
        int[][] newMatrix = removeZeroRowColumn(matrix);
        for (int[] row : newMatrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
