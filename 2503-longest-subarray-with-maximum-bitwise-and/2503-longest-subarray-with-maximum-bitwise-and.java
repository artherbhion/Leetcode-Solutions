class Solution {
    public int longestSubarray(int[] nums) {
        int max = Integer.MIN_VALUE;
        // Find the maximum element in the array
        for (int i : nums) {
            max = Math.max(max, i);
        }

        int longest = 0;
        int currentLength = 0;

        // Traverse the array to find the longest subarray containing only the maximum element
        for (int num : nums) {
            if (num == max) {
                currentLength++;
            } else {
                longest = Math.max(longest, currentLength);
                currentLength = 0;
            }
        }
        
        // Check the last segment
        longest = Math.max(longest, currentLength);

        return longest;
    }
}
