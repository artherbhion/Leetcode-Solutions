public class Solution {
    public int SingleNumber(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.Length;i++){
            ans^=nums[i];
        }
        return ans;
    }
}