class Solution {
    public int pivotIndex(int[] nums) {
     int total=0;
     for(int i=0;i<nums.length;i++){
        total+=nums[i];
     }
     int cursum=0;
     for(int i=0;i<nums.length;i++){
        cursum+=nums[i];
        int left=cursum-nums[i];
        int right=total-cursum;
        if(left==right){
            return i;
        }
     }
     return -1;

    }
}