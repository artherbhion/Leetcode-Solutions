class Solution {
    public void solve(char[][] board) {
      int r=board.length;
      int c=board[0].length;
      for(int i=0;i<r;i++){
        dfs(i,0,board,r,c);
        dfs(i,c-1,board,r,c);
      }
      for(int i=0;i<c;i++){
        dfs(0,i,board,r,c);
        dfs(r-1,i,board,r,c);
      }
      for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            if(board[i][j]=='O'){
                board[i][j]='X';
            }
            if(board[i][j]=='A'){
                board[i][j]='O';
            }
        }
      }

    }
    public void dfs(int r,int c,char[][] board,int R,int C) {
        if(r<0 || r>=R || c<0 || c>=C || board[r][c]=='X' ||board[r][c]=='A' )return;
        board[r][c]='A';
        dfs(r+1,c,board,R,C);
        dfs(r-1,c,board,R,C);
        dfs(r,c+1,board,R,C);
        dfs(r,c-1,board,R,C);
    }
}