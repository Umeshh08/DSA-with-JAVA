package Recursion;

public class factorial {
    public static int factor(int n){
        if(n==0){
            return 1;
        }
        int Fnm1 = factor(n-1);
        int Fr = n*Fnm1;
        return Fr;

    }

    public static void main(String[] args) {

        System.out.println(factor(0));

        
    }
}
