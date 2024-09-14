import java.util.*;
class Cell{
    public Cell(int r,int c){
        this.row=r;
        this.col=c;
    }
    int row,col;
}
class Solution {
    public void solveSudoku(char[][] board) {
        int size=9;
        int r=size,c=size;
        int[] rflag= new int[9];
        int[] cflag= new int[9];
        int[] smflag= new int[9];
        for(int row=0;row<9;row++){
            for(int col=0;col<9;col++){
                char ch=board[row][col];
                if(ch!='.'){
                    int smidx=(row/3)*3+col/3;
                    int dig=(int)(ch-'0');
                    rflag[row]|=(1<<dig);
                    cflag[col]|=(1<<dig);
                    smflag[smidx]|=(1<<dig);
                }
            }
        }
        solve(board,rflag,cflag,smflag,size);
    }
    private boolean solve(char[][] board,int[] rflag,int[] cflag,int[] smflag,int size){
        Cell tofill=getunfilled(board,size);
        if(tofill==null){
            return true;
        }
         int smidx = (tofill.row / 3) * 3 + tofill.col / 3; 
        for(int dig=1;dig<=9;dig++){
            if((rflag[tofill.row]&(1<<dig))==0 && (cflag[tofill.col]&(1<<dig))==0 && (smflag[smidx]&(1<<dig))==0){
                board[tofill.row][tofill.col]=(char)('0'+dig);
                rflag[tofill.row]|=(1<<dig);
                 cflag[tofill.col]|=(1<<dig);
                smflag[smidx]|=(1<<dig);
                if(solve(board,rflag,cflag,smflag,size)){
                    return true;
                }
                board[tofill.row][tofill.col]='.';
                rflag[tofill.row]^=(1<<dig);
                cflag[tofill.col]^=(1<<dig);
                smflag[smidx]^=(1<<dig);
            }
        }
        return false;
    }
    private Cell getunfilled(char[][] board,int size){
        for(int r=0;r<size;r++){
            for(int c=0;c<size;c++){
                if(board[r][c]=='.'){
                    return new Cell(r,c);
                }
            }
        }
        return null;
    }
}