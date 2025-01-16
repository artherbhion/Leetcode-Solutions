class Solution {
        public int totalSteps(int[] nums) {
        int ans = 0;
        Stack<int[]> stack = new Stack<int[]>();
        for(int i = nums.length-1; i >= 0; i--) {
            if(stack.isEmpty() || stack.peek()[0] >= nums[i]) {
                stack.push(new int[]{nums[i], 0});
            }else{
                int count = 0;
                while(!stack.isEmpty() && stack.peek()[0] < nums[i]) {
                    count++;
                    int[] item = stack.pop();
                    if(count < item[1]) count += (item[1] - count);
                }
                stack.push(new int[]{nums[i], count});
                ans = Math.max(ans, count);
            }
        }
        
        return ans;
    }
}