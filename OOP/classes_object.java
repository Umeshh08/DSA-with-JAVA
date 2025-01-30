package OOP;


public class classes_object {
    
    public static void main(String[] args) {
        Pen p = new Pen();
        p.color_change("blue");
        System.out.println(p.color);
        //pbject for student class

        student s1= new student();
        s1.perc(35,69,51);
        System.out.println(s1.percentage);

        //object for Pen1
        Pen1 p1 = new Pen1();
        p1.setcolor("RED");
        System.out.println(p1.getcolor());

                            
    }
}
class Pen{
    String color;
    int tip;
    void color_change(String newcolor){
        color = newcolor;


    }
    void tipsize(int newTip){
        tip = newTip;

    }
}

class student{
    int id;
    float percentage;
    void perc(int chem,int math,int physics){
        percentage = (chem+math+physics)/3;
    }
}
//class for learning getters and setters
class Pen1{
    private String color;
    private int tip;
    //getters

    String getcolor(){
        return this.color;
    }


    void setcolor(String newcolor){
        color = newcolor;
    }
    
    void tipsize(int newTip){
        tip = newTip;

    }
}




