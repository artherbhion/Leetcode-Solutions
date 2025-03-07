class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int f=1;
            if(i-k>=0){
                if(nums[i]<=nums[i-k]){
                    f=0;
                }
            }
            if(i+k<nums.length){
                if( nums[i]<=nums[i+k]){
                   f=0;                   
                }
            }
            if(f==1){
                sum+=nums[i];
                System.out.print(nums[i]);
            }
        }
        return sum;
    }
}