// public class store_rev_num {
//     public static void main(String args[]){
//         int n = 10899;
//         int rev = 0;
//         while(n > 0){
//             int Lastdigit= n%10;
//             rev = (rev*10)+Lastdigit; 
//             n = n/10;
//         }
//         System.out.println(rev);
//     }
// }






















public class store_rev_num{

    int rev = 0;
    public static void store_rev(int n){

        while(n>0){
            int lastdigit = n%10;
            int rev  = lastdigit;
            n= n/10;
            System.out.print(rev);
        
        }
        
    }
    public static void main(String[] args) {
        store_rev(12345);
    }

}