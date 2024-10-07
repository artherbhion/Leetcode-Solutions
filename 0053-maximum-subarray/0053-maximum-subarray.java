class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length,cursum=0,max=Integer.MIN_VALUE;
        if(nums.length==1){
            return nums[0];
        }
        for(int i=0;i<n;i++){
            cursum+=nums[i];
            if(cursum>max){
                max=cursum;
            }
            if(cursum<0){
                if(cursum<0 && max==0){
                max=cursum;
                cursum=0;
            }   else{
                cursum=0;
                }
            }
        }
        if(max<0){
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0&& max<0){
                max=0;
            }
            }
        }
        return max;
    }
}