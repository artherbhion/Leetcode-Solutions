class Solution {
    public int findKthPositive(int[] arr, int k) {
       HashSet<Integer> set=new HashSet<>();
        int max=0;
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
            max=Math.max(arr[i],max);
        }
        int c=0;
        for(int i=1;i<max;i++){
            if(!set.contains(i)){
                c++;
            }
            if(c==k){
                return i;
            }
        }
        return max+k-c;
    }
}