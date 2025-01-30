import java.util.HashSet;

public class unionAndIntersection {

    
    public static void main(String[] args) {
        
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};

        HashSet<Integer> set = new HashSet<>();
      

        for(Integer ele1: arr1){
            set.add(ele1);
        }
        for(Integer ele2: arr2){
            set.add(ele2);
        }
        System.out.println("Union is: "+set.size());

        set.clear();

        for(Integer ele1: arr1){
            set.add(ele1);
        }
        int count = 0;
        for(int i = 0; i<arr2.length;i++){
            if(set.contains(arr2[i])){
                count++;
                set.remove(arr2[i]);
            }
        }
        System.out.println("Intersection is : "+count);
        
    }
}
