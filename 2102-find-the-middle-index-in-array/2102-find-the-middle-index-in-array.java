class Solution {
    public int findMiddleIndex(int[] nums) {
    int total=0;
     for(int i=0;i<nums.length;i++){
        total+=nums[i];
     }
     int cursum=0;
     for(int i=0;i<nums.length;i++){
        cursum+=nums[i];
        if(cursum-nums[i]==total-cursum){
            return i;
        }
     }
     return -1;

    }
}