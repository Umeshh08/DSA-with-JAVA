package Functions;

public class conversion {
    public static void BinToDec(int n){
        int decNum = 0;
        int pow = 0;
       
        while(n>0){
          int lastdigit = n%10;
            decNum = decNum+(lastdigit*(int)Math.pow(2, pow));
            pow++;
            lastdigit= n/10;
           
        }  
        System.out.println("the game"+decNum);
    
    }
public static void main(String[] args) {
    BinToDec(101);
}
}
