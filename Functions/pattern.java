public class pattern {

    public static void hollow_square(int Rows , int Coloumn){
        for(int i = 0; i<=Rows ; i++){
            for(int j=0; j<=Coloumn; j++){
                if(i == 0 || j == 0 || j==Coloumn || i==Rows){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
               
            }
            System.out.println();
        }
        
        
    }
    public static void main(String[] args) {
         hollow_square(5, 6);
        
        
    }
    
}
