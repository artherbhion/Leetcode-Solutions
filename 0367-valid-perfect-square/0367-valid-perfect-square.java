class Solution {
    public boolean isPerfectSquare(int num) {
        long s=2;
        int e=num;
        if(num==1) return true;
        while(s<num)
        {
            if(s*s==num){
                System.out.print(s);
                return true;
            }
            s++;
        }
        return false;
    }
}