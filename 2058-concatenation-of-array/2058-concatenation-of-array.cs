public class Solution {
    public int[] GetConcatenation(int[] nums) {
        int[] arr=new int[nums.Length*2];
        for(int i=0;i<nums.Length*2;i++){
            if(i>=nums.Length){
                arr[i]=nums[i-nums.Length];
            }
            else{
                arr[i]=nums[i];
            }
        }
        return arr;
    }
}