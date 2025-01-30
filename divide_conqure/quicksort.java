package divide_conqure;

class quicksort{
    public static void printarr(int arr[]){
        for(int i= 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void Quicksort(int arr[],int start,int end){
        if(start>=end){
            return;
        }
        
       int pidx = partition(arr, start, end);
       Quicksort(arr, start, pidx-1);
       Quicksort(arr, pidx+1, end);
        
    }
    public static int partition(int arr[],int start,int end){
        int pivote = arr[end];
        int i = start-1;
        
        for(int j=start;j<end;j++){
            if(arr[j]<=pivote){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                
            }
          
        } 
          i++;
            int temp = arr[end];//pivote is at the end in this we put the pivote at right place
            arr[end] = arr[i]; 
            arr[i] = temp;
            return i;
        
    }

     
    public static void main(String[] args) {

        int arr[] = {4,2,9,1,2,3};
        Quicksort(arr, 0, arr.length-1);
        printarr(arr);

        
    }


}