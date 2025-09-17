public class Solution {
    public void SortColors(int[] nums) {
        int zero=count(nums,0);
        int one=count(nums,1);
        int two=count(nums,2);
        fill(nums,0,zero,0);
        fill(nums,zero,zero+one,1);
        fill(nums,zero+one,nums.Length,2);
    }
    public int count(int[] nums,int n){
        int c=0;
        for(int i=0;i<nums.Length;i++){
            if(n==nums[i])c++;
        }
        return c;
    }
    public void fill(int[] nums,int s,int e,int n){
        for(int i=s;i<e;i++){
            nums[i]=n;
        }
    }
}