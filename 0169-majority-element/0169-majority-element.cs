public class Solution {
    public int MajorityElement(int[] nums) {
        Dictionary<int,int> map=new Dictionary<int,int>();
        for(int i=0;i<nums.Length;i++){
            if(map.Count!=0 && map.ContainsKey(nums[i])){
                map[nums[i]]+=1;
            }
            else{
                map[nums[i]]=1;
            }
        }
        int max=0,maxnum=nums[0];
        for(int i=0;i<nums.Length;i++){
            if(map[nums[i]]>max){
                max=map[nums[i]];
                maxnum=nums[i];
            }
        }return maxnum;
    }
}