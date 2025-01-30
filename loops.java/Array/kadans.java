package Array;

public class kadans {
    public static void kadans(int arr[]){
        int maxsum = Integer.MIN_VALUE;
        int currsum = 0;
        for(int i =0; i< arr.length;i++){
            currsum = currsum+arr[i];
            if(currsum<0){
                currsum=0;
            }
            maxsum = Math.max(currsum,maxsum);


            
        }
        System.out.println("maximum subarray sum is: "+maxsum);

    }


    

public static void main(String args[]){

    int arr[] = {-2,5,-1,-3,5};
    kadans(arr);



}
}
