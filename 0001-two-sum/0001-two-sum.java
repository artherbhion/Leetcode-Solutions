class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> m= new HashMap<>();
       for(int i=0;i<nums.length;i++){
        if(m.containsKey(target-nums[i])){
            return new int [] {m.get(target-nums[i]),i};
        }
        else{
            m.put(nums[i],i);
        }
       } return new int [] {0,0};
    }
}