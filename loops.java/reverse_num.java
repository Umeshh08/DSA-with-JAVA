import java.util.Scanner;

public class reverse_num {
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println("The given number: " + n);
    System.out.print("The reverse number is: ");
    while(n>=0){
     int Lastdigit = n%10;
        n = n/10;

    System.out.print(Lastdigit);
       
    }
    
}
}
