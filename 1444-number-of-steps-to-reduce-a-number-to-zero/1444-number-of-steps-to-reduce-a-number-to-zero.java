class Solution {
    public int numberOfSteps(int num) {
        int c=count(num,0);
        return c;
    }
    public int count(int num,int c){
        if(num==0){
            return c;
        }
        if(num%2==0){
           return count(num/2,c+1);
        }
        return count(num-1,c+1);
    }
}