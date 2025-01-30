package Recursion;

public class RecursionQ2 {

    public static int Sum(int n){
        if(n==1){
            return 1;
        }
        int Fn = Sum(n-1);
        int Fsum = n+Fn;
        return Fsum;

    }
    public static void main(String[] args) {
        System.out.println(Sum(4));
    }
}
