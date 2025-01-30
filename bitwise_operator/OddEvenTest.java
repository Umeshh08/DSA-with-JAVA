package bitwise_operator;

public class OddEvenTest{
    public static void OddEven(int n){
        int bitmask=1;
        if((n & bitmask) == 0){
            System.out.println("this is even Number");

        }else{
            System.out.println("This is odd Number");
        }
    }
    public static void main(String[] args) {
        OddEven(12);
        OddEven(2);
        OddEven(11);
       
        
    }
    
}
