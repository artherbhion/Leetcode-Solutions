class Solution {
    public int findFinalValue(int[] nums, int original) {
        // HashSet<Integer> map=new HashSet<>();
        // for(int i=0;i<nums.length;i++){
        //     map.add(nums[i]);
        // }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==original) return findFinalValue(nums,original*2);
        }
        return original;
    }
    // public static int find(int original,HashSet<Integer> map){
    //     if(!map.contains(original))return original;
    //     return find(original*2,map);
    // }
}