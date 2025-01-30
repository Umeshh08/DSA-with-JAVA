package bitwise_operator;

public class LeftRightShift {
    public static int GetithBIT(int n,int i){
        int bitmask = 1<<i;
        if((bitmask & n)==0){
            return 1;
        }else{
            return 0;
        }


    }
    public static int SetithBit(int n,int i){
        int bitmask= 1<<i;
        return n|bitmask;
        
    }
    public static void main(String args[]){
        // System.out.println(5<<2);
        System.out.println(GetithBIT(15, 2));
        System.out.println(SetithBit(10, 2));
    }
}
