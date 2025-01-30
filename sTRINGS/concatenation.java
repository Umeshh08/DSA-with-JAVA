public class concatenation {
    public static void printString(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static  void main(String[] args) {
        String firstname = "Umesh";
        String Sirname = "Nemane";
        String Fullname = firstname +" "+ Sirname;
        System.out.println(Fullname);
        System.out.println(Fullname.charAt(6));
        printString(Fullname);
    }
    
}
