package OOP;

public class abstraction {
 
    public static void main(String[] args) {
        Horse H = new Horse();
        H.walk();
        H.eat();

        Chicken C = new Chicken();
        C.walk();
        C.eat();
    }
    
}
abstract class Animal{
    void eat(){
        System.out.println("Animal eat");
    }
    
    abstract void walk();  //abstract method dont have definition
}

class Horse extends Animal{
    void walk(){
        System.out.println("Horse walks on four legs");     //it is compulsory to declare this method in subclass as it is in Animal class
          
        
    }
}

class Chicken extends Animal{
    void walk(){
        System.out.println("walks on two legs");
    }
}
