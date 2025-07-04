class Solution {
    public int findUnsortedSubarray(int[] nums) {
        if(nums.length==1)return 0;
        int l=0,r=nums.length-1;
        int[] arr=nums.clone();
        Arrays.sort(nums);
        while(l<r){
            if(arr[l]==nums[l]){
                l++;
            }
            if(arr[r]==nums[r]){
                r--;
            }
            if(arr[l]!=nums[l]&&arr[r]!=nums[r])break;
        }
        if(l==r)return 0;
        return r-l+1;
    }
}