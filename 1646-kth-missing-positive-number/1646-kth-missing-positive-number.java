class Solution {
    public int findKthPositive(int[] arr, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        for(int i=0;i<arr.length;i++){
            map.put(i,arr[i]);
            max=Math.max(arr[i],max);
        }
        int c=0;
        for(int i=1;i<max;i++){
            if(!map.containsValue(i)){
                c++;
            }
            if(c==k){
                return i;
            }
        }
        System.out.print(c);
        if(c<k){
            return max+k-c;
        }
        return 0;
    }
}