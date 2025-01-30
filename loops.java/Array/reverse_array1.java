package Array;

public class reverse_array1 {
    public static void reverse(int arr[]){
        int start = 0 ,last = arr.length-1;

        while(start<last){
            int temp = arr[last];
            arr[last] = arr[start];
            arr[start]= temp;
            start++;
            last--;

        }


    }
   
    public static void main(String arg[]){
        int arr[] ={6,2,5,89,0,1};
       reverse(arr);
        for(int i= 0;i<arr.length; i++){
            System.out.print(" "+arr[i]);

        }


    }
    
    
}
