class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int sum = 0;
        for (int i = cost.length - 1; i >= 0; i--) {
            if ((cost.length - i ) % 3 != 0) {
                sum += cost[i];
            }
        }
        return sum;
    }
}