package Recursion;

public class RecursionQ7 {
    public static int optimum(int a,int n){
        if(n==0){
            return 1;
        }
        int halfpower = optimum(a,n/2)*optimum(a, n/2);
    if(n%2!=0){
        halfpower =a*halfpower;
    }
    return halfpower;

}
public static void main(String[] args) {
    System.out.println(optimum(2, 3));
}
}