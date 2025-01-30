import java.util.Scanner;

public class sum_of_natNUM {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the number:");    
        int n = sc.nextInt();
        int sum = 0;
        int i = 0;

        while(i<=n){
            sum += i;
            i++;
        }
        System.out.println("Sum is :" + sum);
    }
  
    
}
