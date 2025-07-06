class Solution {
    public boolean isValidSudoku(char[][] board) {
    boolean[][] rows = new boolean[9][9];
    boolean[][] columns = new boolean[9][9];
    boolean[][] subBoxes = new boolean[9][9];
    for(int i=0;i<9;i++){
        for(int j=0;j<9;j++){
            if(board[i][j]!='.'){
                int num = board[i][j] - '1';
                int boxIndex = (i/3)*3 + (j/3);
            if(rows[i][num] || columns[j][num] || subBoxes[boxIndex][num])
            {
                return false;
            }
            rows[i][num] = true;
        columns[j][num] = true;
        subBoxes[boxIndex][num] = true;
          }
        }
    }
    return true;
    }
}