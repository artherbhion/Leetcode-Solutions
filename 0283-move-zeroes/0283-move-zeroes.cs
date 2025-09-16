public class Solution {
    public void MoveZeroes(int[] nums) {
        int c=0,zero=0;
        for(int i=0;i<nums.Length;i++){
            if(nums[i]!=0){
                nums[c++]=nums[i];
            }
            else{
                zero++;
            }
        }
        for(int i=nums.Length-1;i>nums.Length-1-zero;i--){
            nums[i]=0;
        }
    }
}