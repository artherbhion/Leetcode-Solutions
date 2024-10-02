class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int c=0;
        int max=0;
        if(nums.length==0)return 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]+1==nums[i+1] ){
                c++;
            }
            if(nums[i]+1!=nums[i+1] && nums[i]!=nums[i+1]){
                c=0;
            }
            if(c>max){
                max=c;
            }
        } return max+1;
    }
}