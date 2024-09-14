class Solution {
    public int longestSubarray(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i : nums) {
            max = Math.max(max, i);
        }
        int longest = 0;
        int currentLength = 0;
        for (int num : nums) {
            if (num == max) {
                currentLength++;
            } else {
                longest = Math.max(longest, currentLength);
                currentLength = 0;
            }
        }
        longest = Math.max(longest, currentLength);
        return longest;
    }
}
