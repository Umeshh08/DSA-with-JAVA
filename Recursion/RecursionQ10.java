package Recursion;
//friends PAIRING PROBLEM
// Given n friends, each one can remain single or can be paired up with some other
// friend. Each friend can be paired only once. Find out the total number of ways in
// which friends can remain single or can be paired up.
// public class RecursionQ10 {
//     public static int Pairing_friends(int n){
//         if(n==1||n==2){
//             return n;
//         }

//         //n can be single
//         int nm1 = Pairing_friends(n-1);
   
//         //if paired
//         int nm2 = Pairing_friends(n-2);
//         int pairways = (n-1)*nm2;
//         int totalways = nm1+pairways;
//         return totalways;
        

//     }
//     public static void main(String[] args) {
//         System.out.println(Pairing_friends(4));
        
//     }
// }
public class RecursionQ10{
    public static int PAIRING(int n){
        if(n==1||n==2||n==0){
            return n;
        }
        
         
        int nm1 = PAIRING(n-1);

        int nm2 = PAIRING(n-2);
        int pairways = (n-1)*nm2;
        int totalways = nm1+pairways;

        return totalways;

    }
    public static void main(String args[]){
        System.out.println(PAIRING(10));

    }
}