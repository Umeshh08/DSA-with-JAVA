public class interfaces {
    public static void main(String[] args) {
        Dog D = new Dog();
        D.eat();

        Lion L = new Lion();
        L.eat(); 
    }
}
interface Animal{
    void eat();
}

class Lion implements Animal{
    public void eat(){
        System.out.println("Vegetarion");
    }
}

class Dog implements Animal{
    public void eat(){
        System.out.println("veg and nonveg");
    }
}