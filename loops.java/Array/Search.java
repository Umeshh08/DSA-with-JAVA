package Array;

public class Search {

    public static int LinearSearch(int array[] , int key){
        for(int i = 0;i<array.length;i++){

            if(array[i]==key){
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int array[] = {5,2,8,5,3,0};
        int index = LinearSearch(array,8);
        if(index == -1 ){
        System.out.println("Given Element iS not present in the array");
        }
        else{
            System.out.println("The index of the element is: " + index);
        }
    }


}
