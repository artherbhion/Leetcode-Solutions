class Solution {
    public int maxAscendingSum(int[] nums) {
        int max=0,curr=nums[0];
        for(int i=1;i<nums.length;i++){
            max=Math.max(curr,max);
            if(nums[i]>nums[i-1]){
                curr+=nums[i];
            }
            else{ 
                // max=Math.max(curr,max);             
               curr=nums[i];
            } 
            System.out.println(curr+" "+max);
        } 
        
        return curr>max?curr:max;
    }
}