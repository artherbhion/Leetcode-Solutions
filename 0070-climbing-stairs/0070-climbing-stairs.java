class Solution {
    public int climbStairs(int n) {
        int pre=0;
        int cur=1;
        while(n>0){
            int temp=pre+cur;
            pre=cur;
            cur=temp;
            n--;
        }
        return cur;
    }
}