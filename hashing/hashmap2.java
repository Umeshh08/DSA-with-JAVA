import java.util.*;

public class hashmap2 {
    public static void main(String[] args) {
         HashMap<String,Integer> hm= new HashMap<>();

        //insert
        hm.put("India" , 200);
        hm.put("Japan" , 100);
        hm.put("Russia" , 600);
        hm.put("China" , 000);
        hm.put("america" , 200);

        System.out.println(hm);


        // Set<String> keys = hm.keySet();
        // System.out.println(keys);
        
        // for(String key:keys){
        //     System.out.println("for key "+key+"  value is: "+hm.get(key));
        // }
    }
}
