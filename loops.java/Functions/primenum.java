package Functions;

public class primenum {

    public static boolean PrimeOrNot(int n){
        if(n == 2){
            return true;

        }
        for( int i=2;  i<=n-1; i++){
            if(n%i == 0){
                return false;
            }
            
        }
        return true;

    }
    public static void Print_Prime(int n){
        for(int i = 2; i<=n; i++){
            if(PrimeOrNot(i)){
               System.out.print(i+" ");

            }

        }
    }
    

    public static void main(String[] args) {
        System.out.println(PrimeOrNot(2));
        Print_Prime(20);
    }
    
}
