package arraylist;
import java.util.ArrayList;

public class pairsum {

    public static boolean PairSum(ArrayList<Integer>List,int target){

        for(int i=0;i<List.size();i++){
            for(int j=i+1;j<List.size();j++){
                if(List.get(i)+List.get(j)==target)
                    return true;               
            }
        }
        return false;

    }

    public static boolean Pairsum2(ArrayList<Integer>List, int target){
        int rp = 0;
        int lp = List.size();
        while(rp!= lp){
            if(List.get(rp)+List.get(lp)==target){
                return true;
            }
            else if (List.get(rp)+List.get(lp)<target) 
                lp++; 
                
            else;
                rp++;
            

        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        List.add(6);
        System.out.println(PairSum(List, 5));




        
    }
    
}
