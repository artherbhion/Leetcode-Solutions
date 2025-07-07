class Solution {
    private:
    void dfs(int i, int j,vector<vector<int>> &vis,vector<vector<char>>& board){
        int n=board.size();
        int m=board[0].size();
        vis[i][j]=1;
        int a[]={-1,0,1,0};
        int b[]={0, -1, 0, 1};
        for(int k=0; k<4 ;k++){
            int nr= i + a[k];
            int nc = j+ b[k];
            if(nr<0 || nc <0 || nr==n || nc==m ) continue;
            if(board[nr][nc]=='O' && !vis[nr][nc]) dfs(nr,nc,vis,board);
        }
    }
public:
    void solve(vector<vector<char>>& board) {
        int n=board.size();
        int m=board[0].size();

        vector<vector<int>> vis(n, vector<int>(m,0));

        for(int j=0;j<m;j++){
            if(board[0][j]=='O' && !vis[0][j]) dfs(0,j,vis,board);
            if(board[n-1][j]=='O' && !vis[n-1][j]) dfs(n-1, j, vis, board);
        }
        for(int i=0;i<n;i++){
            if(board[i][0]=='O' && !vis[i][0]) dfs(i,0,vis,board);
            if(board[i][m-1]=='O' && !vis[i][m-1]) dfs(i,m-1,vis,board);
        }

        for(int i=0; i<n ;i++){
            for(int j=0;  j<m ;j++){
                if(board[i][j]=='O' && !vis[i][j]) board[i][j]='X';
            }
        }
    }
};