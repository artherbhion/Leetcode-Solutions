class Solution {
    int mod = (int)(1e9 + 7);
    public long power(int a, long b) {
        if (b == 0) return 1;
        long ans = power(a, b / 2);
        if (b % 2 == 0) {
            return (ans * ans) % mod;
        } else {
            return (((ans * ans) % mod) * a) % mod;
        }
    }
    public int countGoodNumbers(long n) {
        return (int)((power(5, (n + 1) / 2) * power(4, n / 2)) % mod);
    }
}