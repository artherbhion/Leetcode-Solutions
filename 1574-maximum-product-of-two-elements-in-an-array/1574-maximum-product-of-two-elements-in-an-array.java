class Solution {
    public int maxProduct(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]-1;
        }
        int max=1;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                max=Math.max(max,nums[i]*nums[j]);
            }
        }
        if(max==1){
            return 0;
        }
        return max;
    }
}