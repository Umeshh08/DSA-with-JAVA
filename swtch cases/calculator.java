import java.util.Scanner;

public class calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first num: ");
        int a = sc.nextInt();
        System.out.print("Enter the second first num: ");
        int b = sc.nextInt();
        System.out.print("Enter the operator: ");
        char operator = sc.next().charAt(0);

        switch(operator){
            case '+' : System.out.println("The sum is: " + (a+b));
                    break;
            case'-' : System.out.println("The substraction is: " + (a-b));
                    break;
            case'/' : System.out.println("The division is: " + (a/b));
                    break;
            case'*' : System.out.println("The multiplication is: " +(a*b));
                    break;
            default : System.out.println("Enter the valid operator");        

        }
}
}