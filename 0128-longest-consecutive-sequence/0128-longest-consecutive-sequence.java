class Solution {
    public int longestConsecutive(int[] nums) {
       HashSet<Integer> map=new HashSet<>();
       int n=nums.length;
       for(int i=0;i<n;i++){
        map.add(nums[i]);
       }
       int max=0;
       for (int num : map){        
         if (!map.contains(num - 1)) {
                int cs = 1;
                while(map.contains(num+1)){
                        cs++;
                        num=num+1;
                }
        max=Math.max(cs,max);
         }
       }
       return max;
    }
}