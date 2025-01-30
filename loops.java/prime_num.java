import java.util.Scanner;

public class prime_num {

    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        boolean num = true;

        for(int i = 2; i<n ; i++){
            if(n%i == 0){
                num = false;
            }

        }
        if(num == true){
            System.out.println("The Number is prime number");
        }
        else{
            System.out.println("It is not prime number");
        }
       
    }
    
}
