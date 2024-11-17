class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int n = nums.length;
        long[] sum = new long[n + 1];
        for (int i = 0; i < n; i++) {
            sum[i + 1] = sum[i] + nums[i];
        }
        int[] q = new int[n + 1];
        int l = 0, r = 0;
        int ans = n + 1;
        for (int i = 0; i < sum.length; i++) {
            while (r > l && sum[i] >= sum[q[l]] + k)
                ans = Math.min(ans, i - q[l++]);
            while (r > l && sum[i] <= sum[q[r - 1]])
                r--;
            q[r++] = i;
        }
        return ans <= n ? ans : -1;
        
    }
}