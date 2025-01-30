public class SpiralMatrix {
    public static void spiralDisplay(int matrix[][]) {
        int n = matrix.length;
        int m = matrix[0].length;
        int start_row = 0;
        int end_row = n - 1;
        int start_col = 0;
        int end_col = m - 1;

        while (start_row <= end_row && start_col <= end_col) {
            // For the top border
            for (int i = start_col; i <= end_col; i++) {
                System.out.print(matrix[start_row][i] + " ");
            }
            start_row++;
            
            // For the right border
            for (int j = start_row; j <= end_row; j++) {
                System.out.print(matrix[j][end_col] + " ");
            }
            end_col--;
            
            // For the bottom border, check if the current row is already traversed
            if (start_row <= end_row) {
                for (int k = end_col; k >= start_col; k--) {
                    System.out.print(matrix[end_row][k] + " ");
                }
                end_row--;
            }
            
            // For the left border, check if the current column is already traversed
            if (start_col <= end_col) {
                for (int i = end_row; i >= start_row; i--) {
                    System.out.print(matrix[i][start_col] + " ");
                }
                start_col++;
            }
        }
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 9},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        spiralDisplay(matrix);
    }
}
