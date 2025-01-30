package backtracking;

public class substring {
    public static void Substring(String str,String ans,int i){
        if(i==str.length()){
            System.out.println(ans);
            return;
        }
        
        //if  yes
        Substring(str, ans+str.charAt(i), i+1);
        //if no
        Substring(str, ans, i+1);

    }
    public static void main(String[] args) {
       String str = "abc"; 
        Substring(str, "", 0);
        
    }
}
