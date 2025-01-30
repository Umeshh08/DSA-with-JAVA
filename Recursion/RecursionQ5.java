package Recursion;

public class RecursionQ5 {
    public static int FirstOccurence(int arr[],int i, int key){
        if(i == arr.length){
            return -1;
        }

        if(arr[i] == key){
            return i;
        }
        return FirstOccurence(arr,i+1, key);
    }
    //LAst occurence

    public static int LastOccurence(int arr[],int i, int key){
              
        if(i == arr.length){
            return -1;
        }
       int Isfound = LastOccurence(arr, i+1, key);
       if(Isfound == -1 && arr[i]==key){
        return i;
       }
       return Isfound;
       }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,3};
        System.out.println(LastOccurence(arr, 0, 3));
            
            
    }
}

