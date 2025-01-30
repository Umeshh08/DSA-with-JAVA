package OOP;

public class inheritance {
    public static void main(String[] args) {
        Dog A1 = new Dog();
        A1.bark();
        A1.run();
        
        Dog F1 = new Dog();
        F1.bark();
        
    }
    
}
class Animal{
    void bark(){
        System.out.println("barking");
    }
    void run(){
        System.out.println("running");

    }
}
 class Dog extends Animal{
    void color(){
        System.out.println("dog color is black");

    }
    }



 