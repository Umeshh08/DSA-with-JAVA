package OOP;

public class copyC {
    public static void main(String[] args) {
        Student s1 = new Student();
      
        s1.marks[0]= 90;
        s1.marks[1]=80;
        s1.marks[3]=100;

        Student s2 = new Student(s1);
        for(int i=0;i<=marks.length;i++){
            System.out.println(s2.marks[i]);

        }

    }
    
}
class Student{
        int marks[];
        String name;
        int password;
        //copy constructor
        Student(Student s1){
            this.marks= s1.marks;
            this.name = s1.name;
           

        }
    Student(){
            this.marks = marks;
            this.name= name;
           int marks[] = new int[3];
    
        
    }
    
}