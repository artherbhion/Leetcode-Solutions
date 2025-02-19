class Solution {
    public int maxArea(int[] nums) {
        int max=0,curr=0,l=0,r=nums.length-1;
        while(l<r){
            int area=(r-l)*Math.min(nums[l],nums[r]);
            max=Math.max(max,area);
            if(nums[l]>nums[r]){
                r--;
            }
            else{
                l++;
            }
        }
        return max;
    }
}