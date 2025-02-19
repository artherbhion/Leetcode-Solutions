import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int max = 0;
        for (int num : set) {
            // Start a new sequence only if num-1 is not in the set
            if (!set.contains(num - 1)) {
                int cs = 1;
                int current = num;

                // Count the length of the consecutive sequence
                while (set.contains(current + 1)) {
                    cs++;
                    current++;
                }
                max = Math.max(max, cs);
            }
        }
        return max;
    }
}
