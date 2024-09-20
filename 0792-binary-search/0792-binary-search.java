class Solution {
    public int search(int[] nums, int target) {
        int x=0;
        if(nums[nums.length-1]==target) return nums.length-1; 
       return bi( nums,target,x);
    }
    public int bi(int[] nums, int target,int x) {
        if(x>=nums.length)return -1;
        if(nums[x]==target){
            return x;
        }
        return bi(nums,target,x+1);
    }

}