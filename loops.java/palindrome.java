class Solution {
    public boolean isPalindrome(int x) {
         int reverse = 0;
         if(x<0){
             return false;
         }
        while(x>0){
            int lastdigit = x%10;
            reverse = (reverse*10)+lastdigit;
            x=x/10;
        }
        if(reverse==x){
            return true;
        }else{
            return false;
        }
    }
}