package Array;

import java.util.Scanner;

public class Largest {
    public static int Largest_Num(int numbers[]){
        int Largest = Integer.MIN_VALUE;

       for(int i = 0; i<=numbers.length ;i++ ){
        if(Largest < numbers[i]){
            Largest = numbers[i];
        }   
       }
       return Largest;
    }
    public static void main(String[] args) {
       int numbers[] = new int[5];
       int n;
       Scanner sc = new Scanner(System.in);
       n = sc.nextInt();
       for(int i = 0 ; i<numbers.length; i++){
        numbers[i] = sc.nextInt();
       }
       System.out.println("The Array is: ");
       for (int i=0; i<numbers.length; i++)   
{  
System.out.print(numbers[i]+ " ");  
}  
System.out.println("The Largest element is: "+ Largest_Num(numbers));
    }

    
}
