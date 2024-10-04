class Solution {
    public void sortColors(int[] nums) {
        int one=0,two=0,zero=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==1)one++;
        else if(nums[i]==0)zero++;
        else two++;
       }
       for(int i=0;i<nums.length;i++){
        if(zero>0){
            nums[i]=0;
            zero--;
            }
        else if(one>0){
            nums[i]=1;
            one--;
        }
        else if(two>0){
            nums[i]=2;
            two--;
        }
       }
       System.out.print(zero+" "+one+" "+two);
    }
}