package backtracking;

public class permutation {
    public static void Perm(String str, String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
        }

//time complexity = O(n*n!) 

        //kaam
        for(int i=0;i<str.length();i++){
            char curr  = str.charAt(i);
            String Newstr  = str.substring(0, i)+str.substring(i+1, str.length());
            Perm(Newstr, ans+curr);  
        }
    }
    public static void main(String[] args) {

        String str = "abc";
        Perm(str,"");


        
    }
}
