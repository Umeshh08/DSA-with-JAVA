package Array;
public class prob1 {

    public static void main(String[] args) {
        int A[] = {5,4,2,1};
        int B[] = {4,1,3,7};
        int ScoreA = 0;
        int ScoreB = 0;

        for(int i=0;i<A.length;i++){
            if(A[i]>B[i]){
                ScoreA ++;
            }else{
                ScoreB++;
            }

        }
        if(ScoreA>ScoreB){
            System.out.println("A");
        }else if(ScoreB>ScoreA){
            System.out.println("B");
        }else{
            System.out.println("Tie");
        }
    }
}
