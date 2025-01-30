public class matrixsum {

    public static int matrix_sum(int matrix[][]){
        int sum = 0;
        // for(int i=0; i<matrix.length;i++){        //complexity is just O(n^2)
        //     for(int j=0;j<matrix[0].length;j++){
        //         if(i == j){
        //             sum+=matrix[i][j];
        //         }
            
        //         if((i+j)==matrix.length-1){
        //              sum+=matrix[i][j];                    

        //         }
        //     }
        // }
        for(int i=0;i<matrix.length;i++){             //complexity is just O(n)
            sum+=matrix[i][i];
            sum+= matrix[i][matrix.length-1-i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1,1,1},
                         {1,2,1},
                         {1,1,1}};

                         System.out.println(matrix_sum(matrix));
    
} 
    
}
