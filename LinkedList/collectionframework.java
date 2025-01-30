import java.util.LinkedList;
public class collectionframework {


    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
    list.addLast(5);
    list.addFirst(2);
   
    list.addFirst(6);
    System.out.println(list); 
    list.removeLast();
    System.out.println(list);
    }
}

