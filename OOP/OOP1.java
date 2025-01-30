package OOP;

public class OOP1 {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student(80);
        Student s3 = new Student("UMESH");
        
    }
    
}

class Student{
    Student(){
        System.out.println("Umesh");
    }
    String name;
    int marks;
    Student(int marks){
       
        System.out.println(marks);
    }
    Student(String name){
        this.name= name;
        System.out.println(name);
    }
}
