class Solution {
    public int minOperations(int[] nums, int[] numsDivide) {
        Arrays.sort(nums);
        int gcd = numsDivide[0];
        for (int num : numsDivide) {
            gcd = gcd(gcd, num);
        }
        for (int i = 0; i < nums.length; i++) {
            if (gcd % nums[i] == 0) {
                return i;
            }
        }
        return -1;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
