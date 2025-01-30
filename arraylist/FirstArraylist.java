package arraylist;
import java.util.ArrayList;

public class FirstArraylist {

    //swapping two numbers;
    public static void swap(ArrayList<Integer> newList, int idx1,int idx2 ){

        int temp = newList.get(idx1);
        newList.set(idx1, newList.get(idx2));
        newList.set(idx2,temp);
            
        }

    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<Integer>(); 
        
        
        //add

        list.add(5);
        list.add(0);
        list.add(5);
        list.add(3);
        list.add(4);
        list.add(2,7);
        // System.out.println(list);

        //remove
        list.remove(3);
        //set operation      
        list.set(0,10);

        // System.out.print(list);
        // System.out.print(list.size());
     //to print all the elements
    //  for(int i=list.size()-1;i>=0;i--){
    //     System.out.print(list.get(i)+" ");  
      
    //  }
      //swap 2 numbers
       ArrayList<Integer> newlist = new ArrayList<Integer>();

        newlist.add(5);
        newlist.add(2);
        newlist.add(4);
        newlist.add(8);
        System.out.println(newlist);
       int idx1 = 2; 
       int idx2 = 0;

       swap(newlist, idx1, idx2);
       System.out.println(newlist);
    }
    
}
