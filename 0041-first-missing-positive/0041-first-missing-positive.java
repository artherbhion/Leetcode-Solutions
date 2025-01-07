class Solution {
    public int firstMissingPositive(int[] nums) {
        // data filtering
        for(int i = 0; i<nums.length;i++){
            if(nums[i]<=0 || nums[i]>= nums.length+1){
                nums[i] = nums.length+1;
            }
        }

        // data visited and then mark that index as -ve
        for(int i = 0;i<nums.length;i++){
            int element = Math.abs(nums[i]);
            if(element == nums.length+1){
                continue;
            }
            int seat = element -1;
            if(nums[seat] > 0){
                nums[seat] = -nums[seat];
            }
        }

        // 
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>0){
                return i+1;
            }
        }
        return nums.length+1;
    }
}