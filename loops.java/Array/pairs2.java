package Array;

public class pairs2 {
    public static void pairs(int arr[]){
        for(int i=0;i<arr.length;i++){
            int curr  = arr[i];
            for(int j = i+1; j<arr.length;j++){
                System.out.print("("+curr +","+arr[j]+")");
            }
            System.out.println();

        }
        
    }

    public static void main(String args[]){
        int arr[] = {3,2,6,7,1,8};
        pairs(arr);
    }
    
}
