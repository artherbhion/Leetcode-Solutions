class Solution {
    public boolean isMonotonic(int[] nums) {
        int ic=0,dc=0;
     for(int i=0;i<nums.length-1;i++){
        if(nums[i]<=nums[i+1]){
            ic++;
        }
        if(nums[i]>=nums[i+1]){
            dc++;
        }
     }     
     if(ic==nums.length-1||dc==nums.length-1){
        return true;
     }  
     return false; 
    }
}