
package Array;

public class maxsubarraysum {
    public static void main(String[] args) {
        int arr[] = {5,3,8,1,9,4};
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i; j<arr.length;j++){
                int end = j;
                currSum = 0;
                for(int k = start;k<=end; k++ ){
                    currSum+=arr[k];

                }
                System.out.println(currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                }

            }        
        }
        System.out.println("max sum= "+ maxSum);
    }
}