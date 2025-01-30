public class inverted_half_number_pyramid {
    
    public static void num_pyra(int n){
        //for no. of rows
        for(int i=1; i<=n; i++){
            //for printing numbers.
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);

            }
            System.out.println();
        }

    }  
    public static void floyds_triangle(int n){
        int counter = 1;
        for(int i = 1; i<=n; i++){
            for(int j = 1;j<=i; j++){
                System.out.print(counter+ " ");
                counter++;

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // num_pyra(5);
        floyds_triangle(5);
    }
}
