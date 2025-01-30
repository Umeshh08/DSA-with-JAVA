package Functions;
public class Product {

    public static int multiply(int a ,int b){
        int Ans = a*b; 
        return Ans;
    
    }
    public static int factorial(int n){
        int f = 1;
        for(int i=1; i<=n ; i++){
            f = f*i;
        }
        return f;
    }
    public static int BinoCoeff(int n ,int r){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n-r);
        int BinoCoef = n_fact/(n_fact*nmr_fact);
        return BinoCoef;

    }
    
    public static void main(String args[]){
        int a = 5; 
        int b = 10;
       
        System.out.println(multiply(a, b));
        // System.out.println(factorial(5));
        System.out.println(BinoCoeff(20, 5));
    }


    
}
