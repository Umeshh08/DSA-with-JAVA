import java.util.HashMap;

public class hashmap{
    public static void main(String[] args) {
        //
        HashMap<String,Integer> hm= new HashMap<>();

        //insert
        hm.put("India" , 200);
        hm.put("Japan" , 100);
        hm.put("Russia" , 600);
        hm.put("China" , 000);
        // System.out.println(hm);
        // int population = hm.get("India");
        // System.out.println(population);
        
        // //containskey
        // System.out.println(hm.containsKey("India"));//returns true or fals 
        System.out.println(hm.remove("China"));
            System.out.println(hm.size());

    }
}