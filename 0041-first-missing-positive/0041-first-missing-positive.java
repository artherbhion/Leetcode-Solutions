class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int l=nums.length;
        if(nums[0]>1)return 1;
        for(int i=0;i<l;i++){
            if(nums[i]>0 ){
                if(i+1<l){
                if((nums[i+1]) != (nums[i]+1) ){
                    int c=nums[i];
                    return(c+1);
                }
                else if(i-1 >0){
                 if(nums[i-1]!=nums[i]-1){
                     int c=nums[i];
                    return(c-1);
                }}
                }
                else{
                    return nums[i]+1;
                    }
            }
        }
        if(nums[0]==0){
            return 1;
        }if(nums[0]<0){
             return 1;
        }
        return 0;
    }
}