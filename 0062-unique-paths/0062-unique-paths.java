class Solution {
    public int uniquePaths(int m, int n) {
        int[][] ans=new int[m][n];
        for(int i=0;i<m;i++){
            ans[i][0]=1;
        }
        for(int i=0;i<n;i++){
            ans[0][i]=1;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                ans[i][j]=ans[i-1][j]+ans[i][j-1];
            }
        }
        return ans[m-1][n-1];
    }
}