class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length,cursum=0,max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            cursum+=nums[i];
            max=Math.max(cursum,max);
            if(cursum<0){
                cursum=0;
            }
        }
        return max;
   }
}
       