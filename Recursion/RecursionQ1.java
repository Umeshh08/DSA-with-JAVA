package Recursion;

public class RecursionQ1 {
     public static void decreasingOrder(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        decreasingOrder(n-1);
    }
    public static void increasingOrder(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        increasingOrder(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        decreasingOrder(10);
        System.out.println("\n");
        increasingOrder(10);
    }
   
}
