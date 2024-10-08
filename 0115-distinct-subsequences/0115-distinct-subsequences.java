class Solution {
    public int numDistinct(String s, String t) {
        int[][] dp=new int[s.length()][t.length()];
        for(int i=0;i<s.length();i++){
            for(int j=0;j<t.length();j++){
                dp[i][j]=-1;
            }
        }
        return solve(dp,s,t,0,0);
    }
    public int solve(int[][] dp,String s,String t,int r,int c){
        if(c==t.length()){
            return 1;
        }
        if(r==s.length()){
            return 0;
        }
        if(dp[r][c]!=-1){
            return dp[r][c];
        }
        if(s.charAt(r)==t.charAt(c)){
            dp[r][c]=solve(dp,s,t,r+1,c+1)+solve(dp,s,t,r+1,c);
        }
        else{
            dp[r][c]=solve(dp,s,t,r+1,c);
        }
        return dp[r][c];
    }
}