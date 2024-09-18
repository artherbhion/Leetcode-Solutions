class Solution {
    public int missingNumber(int[] nums) {
     int n=nums.length;
     int sum=0;
     for(int i=0;i<nums.length;i++){
        sum=sum+nums[i];
     }
     n=(n*(n+1))/2;
    return n-sum;
    }
}