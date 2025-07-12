class Solution {
    public int[] leftRightDifference(int[] nums) {
        int total=0;
     for(int i=0;i<nums.length;i++){
        total+=nums[i];
     }
     int cursum=0;
     for(int i=0;i<nums.length;i++){
        int r=total-cursum-nums[i];
        int l=cursum;
        cursum+=nums[i];
        nums[i]=Math.abs(l-r);
     }
     return nums;

    }
}