class Solution {
    public int mySqrt(int x) {
        long numgi = x;
        while (n * n > x) {
            n = (n + x / n) / 2;
        }    
        return (int) n;
    }
}
