class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        rev(nums,0,nums.length-1);
        rev(nums,0,k-1);
        rev(nums,k,nums.length-1);
    }
    public void rev(int [] nums,int l,int e){
        while(l<e){
           int temp=nums[l];
           nums[l]=nums[e];
           nums[e]=temp;
           l++;
           e--;
        }
    }
}