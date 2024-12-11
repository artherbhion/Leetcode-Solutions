class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        }
       int pre=0,cur=1;
       for(int i=2;i<=n;i++){
        int sum=pre+cur;
        int temp=cur;
        cur=sum;
        pre=temp;
       }
       return cur;
    }
}