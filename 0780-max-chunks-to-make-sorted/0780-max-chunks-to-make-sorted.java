class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n=arr.length;
        int[] pm=arr.clone();
        int[] sm=arr.clone();
        for(int i=1;i<n;i++){
            pm[i]=Math.max(pm[i],pm[i-1]);
        }
         for(int i=n-2;i>=0;i--){
            sm[i]=Math.min(sm[i],sm[i+1]);
        }
        int ch=0;
        for(int i=0;i<n;i++){
            if(i==0 || sm[i]>pm[i-1]){
                ch++;
            }
        }
        return ch;
    }
}