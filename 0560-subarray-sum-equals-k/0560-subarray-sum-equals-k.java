class Solution {
    public int subarraySum(int[] nums, int k) {
        int cursum=0,c=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            cursum=nums[i]+cursum;
            if(map.containsKey(cursum-k)){
                c+=map.get(cursum-k);
            }
            map.put(cursum,map.getOrDefault(cursum,0)+1);
        }
        // System.out.println(map);
        return c;
    }
}