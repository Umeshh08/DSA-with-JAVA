package Recursion;

class Recursion{
    static String arr[] = {"zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
    public static void convert(int number){
        
        if(number==0){
            return;
        }
        int lastdigit = number%10;
        number = number/10;
        convert(number);
        System.out.print(arr[lastdigit]+" ");
    }

    public static void main(String[] args) {
        convert(2356100);
    }
}