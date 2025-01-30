import java.util.*;

public class Strings {

    public static void main(String[] args) {
        String name = "Umesh";
        System.out.println(name);

        Scanner sc = new Scanner(System.in);
        String Name;
        // name = sc.next(); //sc.next() for only one word.
        name = sc.nextLine();
        System.out.println("His name is: " + name);
        System.out.println(name.length()); // in array-->arr.length but in string--> name.length().

    }

}
