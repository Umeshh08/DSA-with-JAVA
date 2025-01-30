public class staircase_search {
    public static boolean stairecase(int matrix[][], int key) {
        int row = 0;
        int col = matrix[0].length-1;
        while (row < matrix.length && col != 0) {
            if (matrix[row][col] == key) {
                System.out.println("key is found at: "+"(" + row +","+ col+")");
                return true;
     
            } else {
                if(key < matrix[row][col]){
                    col--;
                    
                }
                else{
                    if(key > matrix[row][col]){
                        row++;

                    }
                }

            }
        
        }
        System.out.println("key not found");
        return false;
        

    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                     { 5, 6, 7, 10},
                     { 9, 10, 11, 12 },
                     { 13, 14, 15, 16 } };
        stairecase(matrix, 9);
    }

}
