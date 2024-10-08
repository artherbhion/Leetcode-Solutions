class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length,cursum=0,max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int temp=nums[i]+cursum;
            if(nums[i]>cursum && cursum<0){
                cursum=nums[i];
            }
            else{
                cursum=temp;
            }
            if(cursum>max){
                max=cursum;
            }
        }
        return max;
    }
}