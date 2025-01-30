package Array;

public class trp {

    public static int Rainwater(int Height[]){
        int n=Height.length; 
        //calculate left max...
        int leftmax[] = new int[n];
        leftmax[0] = Height[0];
        for(int i=1; i<n; i++){
            leftmax[i] = Math.max(Height[i],leftmax[i-1]);
        }
         //calculate right max...
         int rightmax[] = new int[n];
         for(int i=n-2;i>=0;i--){
            rightmax[i] = Math.max(Height[i], rightmax[i+1]); 


         }
         int TrappedWater = 0;

         for(int i=0;i<n;i++){
           int waterlvl = Math.min(leftmax[i],rightmax[i]);
           TrappedWater =+ waterlvl-Height[i];
         }
         return TrappedWater;
             
    }

    public static void main(String[] args) {
        int Height[] = {4,2,0,6,3,2,5};
        System.out.println(Rainwater(Height));
    }
}
