class Solution {
    public int[] applyOperations(int[] nums) {
       for(int i=0;i<nums.length-1;i++){
        if(nums[i]==nums[i+1]){
            nums[i]*=2;
            nums[i+1]=0;
        }
       }
       int l=0;
        for(int r=0;r<nums.length;r++){
            if (nums[r] != 0) {
                int temp = nums[r];
                nums[r] = nums[l];
                nums[l] = temp;
                l++;
            }
        }
       return nums; 
    }
}