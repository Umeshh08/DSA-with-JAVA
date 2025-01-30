public class Q2{

    public static int sum(int sums[][]){
        int sum=0;
        int col = sums[0].length-1;
        for(int i=0;i<=col;i++){
                sum+=sums[1][i];
            }
            return sum;
        }
      
    
    public static void main(String[] args) {
        int sums[][] = {{1,2,3,4},
                       {4,2,1,9}};
                       System.out.println(sum(sums));
    }
}
