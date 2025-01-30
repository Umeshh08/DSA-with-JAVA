package Array;

public class pairs {

    public static void ARRAY_PAIRS(int arr[]){

        for(int i =0; i<arr.length; i++){
            int curr = arr[i];
            for(int j = i +1; j<arr.length; j++){
                System.out.print("("+curr + ","+arr[j]+")");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = {4,6,2,7,1,9};
        ARRAY_PAIRS(arr);
    }
    
}
