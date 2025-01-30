package arraylist;
import java.util.ArrayList;
public class que1 {
//incorrect solution solve it again
    public static void LonelyNumbers(ArrayList<Integer>List){
        ArrayList<Integer> List2  = new ArrayList<>();
        for(int i=0;i<List.size();i++){
            for(int j=i+1;j<List.size();j++){
                if((List.get(i)+1)!=List.get(j) || (List.get(i)-1)!=List.get(j)){
                    List2.add(j);
                    System.out.println(List2.get(i));
                   
                }
            }
        }
         
    }
    
    public static void main(String[] args) {

        ArrayList<Integer> List  = new ArrayList<>();
        List.add(10);
        List.add(6);
        List.add(5); 
        List.add(8);   
          
        
    }
    
}
