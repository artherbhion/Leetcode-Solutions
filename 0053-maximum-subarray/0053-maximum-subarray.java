class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length,cursum=0,max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]>cursum && cursum<0){
                cursum=nums[i];
            }
            else{
                cursum=nums[i]+cursum;
            }
            max=Math.max(cursum,max);
        }
        return max;
   }
}
       