//PROBLEM STATEMENT
// Given a "2 x n" board and tiles of size "2 x 1", count the number of
// ways to tile the given board using the 2 x 1 tiles.
// (A tile can either be placed horizontally or vertically. )

package Recursion;
public class RecursionQ8 {
    public static int Tilefitting(int n){
        //base condition
        if(n==0||n==1){
            return 1;
        }
        //if tiles are placed vertically
        int nm1 = Tilefitting(n-1);

        //if tiles are placed horizontally
        int nm2 = Tilefitting(n-2);

        int totalways = nm1+nm2;
        return totalways;
       
    }
    public static void main(String[] args) {
        System.out.println(Tilefitting(4));
    }
}
