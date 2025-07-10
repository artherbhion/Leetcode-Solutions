class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int max=0,maxnum=0;
        for(int i: nums){
            if(max<map.get(i)){
                maxnum=i;
                max=map.get(i);

            }
        }
        return maxnum;
    }
}