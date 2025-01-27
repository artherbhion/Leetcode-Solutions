class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length,totalsum=0;
        for(int num:nums){
            totalsum+=num;
        }
        if(totalsum%2!=0){
            return false;
        }
        int target = totalsum / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true; 
        for (int num : nums) {
            for (int j = target; j >= num; j--) {
                dp[j] = dp[j] || dp[j - num];
            }
        }
        return dp[target];
    }
}