class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] a={-1,-1};
        int c=0;
        // if(nums.length==1 && nums[0]==target){
        //     return new int[]{0,0};
        // }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target && c==0){
                a[0]=i;
                a[1]=i;
                c++;
            }
            else if(nums[i]==target){
                a[1]=i;
                c++;
            }
        } return a;
    }
}