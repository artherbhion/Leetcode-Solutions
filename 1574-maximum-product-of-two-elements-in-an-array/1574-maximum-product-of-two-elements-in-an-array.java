class Solution {
    public int maxProduct(int[] nums) {
        int max1 = 0, max2 = 0;
        
        for (int num : nums) {
            num -= 1;
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max2 = num;
            }
        }
        return max1 * max2;
    }
}
