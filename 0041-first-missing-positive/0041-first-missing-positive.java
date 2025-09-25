class Solution {
    public int firstMissingPositive(int[] nums) {        
        HashSet<Integer> set=new HashSet<>(); 
        int max=0;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
            max=Math.max(max,nums[i]);
        }
        int i=1;
        while(i<max){
            if(!set.contains(i)){
                return i;
            }
            i++;
        }
        return max+1;
    }
}
