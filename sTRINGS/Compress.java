public class Compress{

    public static StringBuilder compressIt(String str){
        StringBuilder Newstr= new StringBuilder("");    
        for(int i=0;i<str.length();i++){
            Integer count = 1;
            while( i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count ++;
                i++; 
            }
              Newstr.append(str.charAt(i));
                     if(count>1){
                Newstr.append(count.toString());
            } 
        }
        return Newstr;
    }
    public static void main(String[] args) {
        String str = "aabccc";
        System.out.println(compressIt(str));
    }
}