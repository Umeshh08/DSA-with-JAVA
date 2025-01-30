public class palindrom {
    public static void main(String[] args) {
        int n =53462;
        int last_dig,temp;
        temp=n;
 while(n>0){
    last_dig = n%10;
    n= n/10;

    System.out.print(last_dig);
    if(temp==n){
        System.out.println("palindrome");
    }


 }

 }
        
    }

    
