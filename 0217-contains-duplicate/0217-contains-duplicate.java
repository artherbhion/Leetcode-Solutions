class Solution {
    public boolean containsDuplicate(int[] nums) {
       HashMap <Integer,Integer> map=new HashMap();
       for(int i:nums){
        if(map.containsKey(i)){
            return true;
        }
        else{
            map.put(i,i);
        }
       }
       return false;

    }
}