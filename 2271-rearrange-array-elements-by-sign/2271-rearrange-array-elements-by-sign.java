class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n1[]=new int[nums.length/2+1];
        int n2[]=new int[nums.length/2+1];
        int res[]=new int[nums.length];
        int i1=0,i2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                n1[i1]=nums[i];
                i1++;
            } 
            else{
                n2[i2]=nums[i];
                i2++;
            }           
            }
            res[0]=n1[0];
            int j1=1,j2=0;
            for(int i=1;i<nums.length;i++){
                if(i%2==0){
                   res[i]=n1[j1];
                   j1++;
                }
                else{
                    res[i]=n2[j2];
                   j2++;
                }
            }
        return res;
    }
}