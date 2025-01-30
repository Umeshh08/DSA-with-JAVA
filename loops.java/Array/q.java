package Array;

public class q {
        public static int removeDuplicates(int[] nums) {
            int k=0;
            for(int i=0;i<nums.length-1;i++){
                if(nums[i]!=nums[i+1]){
                    nums[k] = nums[i];
                    k++;
                }
                
            }
            nums[k] = nums[nums.length-1];
            return k+1;
            
        }
        public static void main(String[] args) {
            int nums[] = {1,1,3,5};
            System.out.println(removeDuplicates(nums));
        }
    }


