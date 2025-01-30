package Recursion;
//Question bank prob
public class RecursionQ11 {
    public static void alloccurences(int arr[], int index,int key){
        if(index == arr.length){
            return ;
        }

        if(arr[index]==key){
            System.out.println(index);
           
        }
        alloccurences(arr, index+1, key);
               
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,2,4};
        alloccurences(arr, 0, 2);
        
    }
}
