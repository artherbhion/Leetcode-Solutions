class Solution {
    public int maxProfit(int[] nums) {
        int mp=0,cp=0,min=10000;
        for(int i=0;i<nums.length;i++){
            min=Math.min(min,nums[i]);
            cp=nums[i]-min;
            mp=Math.max(cp,mp);
        }
        return mp;
    }
}