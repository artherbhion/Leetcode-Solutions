class Solution {
     public int countHillValley(int[] a){
        int r = 0, left = a[0];
        for(int i = 1; i < a.length - 1; i++)
            if(left < a[i] && a[i] > a[i + 1] || left > a[i] && a[i] < a[i + 1]){
                r++;
                left = a[i];
            }
        return r;
    }
}