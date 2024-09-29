class Solution {
    public int maximizeSum(final int[] nums, int k) {
        int max = 0;
        for(final int num : nums)
            max = Math.max(max, num);
        return k * (2 * max + k - 1) / 2;
    }
}