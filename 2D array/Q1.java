public class Q1 {

    public static int que1(int matrix[][]) {
     
        int count = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = row + 1; col < matrix[0].length; col++) {
                if (matrix[row][col] == 7) {
                    count += 1;

                }
            }
        }
        return count;

    }

    public static void main(String[] args) {
        int matrix[][] = { { 4, 7, 7 },
                { 8, 7, 7 } };
        System.out.println(que1(matrix));

    }
}
