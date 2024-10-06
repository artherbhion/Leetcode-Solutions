class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int c=0,max=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                c++;
            }
            if(c>max){
                max=c;
                c=0;
            }
        }
        if(c==0 && nums.length>0){
            return 1;
        }
        return c;
    }
}