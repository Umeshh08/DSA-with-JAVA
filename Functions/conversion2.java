public class conversion2 {
    public static void decTobin(int n){
        int mynum = n;
        int bin = 0;
        int pow = 0;
        while(n>0){
           
            int remainder = n%2;
            bin = bin + (remainder*(int)Math.pow(10, pow));
            pow ++;
            n = n/2;
        }
        System.out.println(bin);
    }

public static void main(String[] args) {

    decTobin(8);
    
}
}

