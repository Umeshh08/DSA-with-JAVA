package Recursion;

public class RecursionQ6 {
    public static int Power(int x,int n){
       if(n==0){
        return 1;
       }
        int nm1  = Power(x,n-1);
        int xn = x*nm1;
        return xn;


    }
    public static void main(String[] args) {
        System.out.println(Power(2, 0));
    }
}
