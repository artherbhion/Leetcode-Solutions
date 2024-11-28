class Solution {
    public int jump(int[] nums) {
       int res=0;
       int l=0,r=0;
       while(r<nums.length-1){
        int max=0;
        for(int j=l;j<=r;j++){
           if((nums[j]+j)>max){
            max=nums[j]+j;
           }
        }
        l=r+1;
        r=max;
        res+=1;
       }
       return res;
    }
}