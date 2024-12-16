class Solution {
    public int reverse(int x) {
        long num=0;
        int s=0;
        if(x<0){
            s=1;
            x=x*-1;
        }
        while(x>0){
            int n=x%10;
            num=num*10+n;
            x/=10;
        }if(s==1){
            num=num*-1;
        }
        if(num> Integer.MAX_VALUE || num<Integer.MIN_VALUE){
            return 0;
        }
        return (int)num;
    }
}