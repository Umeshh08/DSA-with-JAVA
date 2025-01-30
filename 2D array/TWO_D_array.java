import java.util.*;

public class TWO_D_array{
    public static boolean Find_key(int arr[][],int key){
        
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
           if(arr[i][j]  == key){
            System.out.println("The key is at the index of: "+ i +","+ j);
            return true;

           }
        }
    }
    return false;
}
    public static int maximnum(int arr[][]){
        int maxi = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){

                if(arr[i][j]>maxi){
                    maxi=arr[i][j];
                }
            }
        }
        System.out.println("Theh maximum Number is: "+maxi);
        return maxi;
    }
    public static void main(String args[]){
          int arr[][] = new int[3][3];

          int n = arr.length , m = arr[0].length;
          Scanner sc = new Scanner(System.in);

    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){

            arr[i][j] = sc.nextInt();
        }
        
    }
     for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.print(arr[i][j]+" ");
           
        }   
        System.out.println();
        }
    Find_key(arr, 9);
    maximnum(arr);
    }    
}
