class Solution {
    public int searchInsert(int[] nums, int target) {
      int l=0,r=nums.length-1;
      if(target<nums[0])
      return 0;
      while(l<=r){
        int mid=(l+r)/2;
        if(nums[mid]<target){
            l=mid+1;
        }
        else if(nums[mid]>target){
            r=mid-1;
        }
        else{
            return mid;
        }
      } 
      return l;
    }
}