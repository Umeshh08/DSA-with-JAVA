class palindomeornot{

    public static boolean palin(int n){
        int rev = 0;
        int temp = n;
        while(temp>0){
            int rem = temp%10;
            rev = (rev*10)+rem;
            temp = temp/10;

        }
        return rev==n;
    }
    public static void main(String[] args) {
        System.out.println(palin(121));
        
    }
}