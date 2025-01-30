package arraylist;

import java.util.ArrayList;

public class containerTwo {

    public static void maxwater(ArrayList<Integer> height){
    
        int maxwater = 0;
        int lp = 0;
        int rp = height.size()-1;

        while(lp<rp){
            int width = rp-lp;
            int ht = Math.min(height.get(lp), height.get(rp));
            int totalwater  = width*ht;
            if(lp<rp){
                lp++;
                maxwater = Math.max(maxwater,totalwater );
            }else{
                rp--;

            }
        }
        System.out.println(maxwater);

    }

    
    public static void main(String[] args) {
         ArrayList<Integer> height = new ArrayList<Integer>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        maxwater(height);
        
    }
}
