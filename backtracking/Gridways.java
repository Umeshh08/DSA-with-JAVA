package backtracking;

public class Gridways{
    public static int gridways(int i, int j,int m , int n){
        if(i==n-1 && j==m-1){
            return 1;
        }else if(i==n || j==n){
            return 0;
        }

        int w1 = gridways(i, j+1, m, n);
        int w2 = gridways(i+1, j, m, n);
        return w1+w2;

    }
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        System.out.println(gridways(0, 0, m, n));
    }
}
