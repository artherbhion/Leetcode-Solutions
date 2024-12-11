class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        }
       int pre=0,cur=1;
       for(int i=2;i<=n;i++){
        int temp=cur;
        cur=cur+pre;
        pre=temp;
       }
       return cur;
    }
}