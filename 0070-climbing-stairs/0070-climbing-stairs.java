class Solution {
    public int climbStairs(int n) {
      if(n==1){
            return 1;
        }
       int pre=1,cur=2;
       for(int i=2;i<n;i++){
        int temp=cur;
        cur=cur+pre;
        pre=temp;
       }
       return cur; 
    }
}