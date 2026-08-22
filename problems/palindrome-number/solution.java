class Solution {
    public boolean isPalindrome(int x) {
        if(x <0){
        return false;
       }
        int num = x ;
        // int ld = 0 ; 
        int reverseNo = 0 ;
       while(x!=0){
        // ld = x % 10;
        reverseNo = (reverseNo * 10 ) +( x % 10);
        x = x/10;
       } 
       

       return num == reverseNo;
    }
}