package OOP;

public class interfaces2 {
    public static void main(String[] args) {
        dog d = new dog();
        d.eatveg();
        
    }
}
interface carnivorous{
    void eatveg();
}
interface herbivorous{
   void eatnonveg(); 
}
class dog implements carnivorous,herbivorous{
   public void eatveg(){
        System.out.println("Eat veg");
    }
    public void eatnonveg(){
        System.out.println("eat nonveg");
    }
}
