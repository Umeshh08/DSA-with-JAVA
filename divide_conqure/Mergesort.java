package divide_conqure;

public class Mergesort {
    public static void printarr(int arr[]){
        for(int i= 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void mergeSort(int arr[],int start,int end ){
    if(start>=end){
        return;
    }
    int mid = start+(end - start)/2;
    mergeSort(arr, start, mid);
    mergeSort(arr,mid+1,end);
    Merge(arr, start, end, mid);

    }
    public static void Merge(int arr[],int start,int end,int mid){
        int temp[] = new int[end-start+1];
        int i = start;
        int j = mid+1;
        int k =0;

        while(i <= mid && j<=end){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k]= arr[j];
                j++;
            }
            k++;

        }
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=end){
            temp[k++] = arr[j++];
        }
        for(k=0, i=start;k<temp.length;k++,i++ ){
            arr[i]=temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,3,8,9,1,2};
        mergeSort(arr, 0, arr.length-1);
        printarr(arr);
        
    }
}
