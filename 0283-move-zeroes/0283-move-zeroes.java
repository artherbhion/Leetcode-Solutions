class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> temp=new ArrayList();
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                temp.add(nums[i]);
                c++;
            }
        }
        for(int i=0;i<c;i++){
            nums[i]=temp.get(i);
        }
        for(int i=c;i<nums.length;i++){
             nums[i]=0;
        }        
    }
}