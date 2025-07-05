class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }
        int max=-1;
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])==arr[i]){
                max=Math.max(arr[i],max);
            }
        }
        return max;
    }
}