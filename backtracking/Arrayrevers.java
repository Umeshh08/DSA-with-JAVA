package backtracking;

public class Arrayrevers {
    public static void changeArr(int arr[],int index,int val){
        //base case
        if(index==arr.length){
            printarr(arr);
            return;
        }

        //kaam
        arr[index] = val;
        changeArr(arr, index+1, val+1);

        arr[index] = val-2;

    }
    public static void printarr(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

      

    }
    public static void main(String args[]){
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printarr(arr);


    }
}
