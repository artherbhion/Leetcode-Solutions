class Solution {
    private String swap(String state,int i,int j){
        StringBuilder s=new StringBuilder(state);
        s.setCharAt(i,state.charAt(j));
        s.setCharAt(j,state.charAt(i));
        return s.toString();
    }
    public int slidingPuzzle(int[][] board) {
        int[][] directions=new int[][]{{1,3},{0,2,4},{1,5},{0,4},{1,3,5},{2,4}};
        String finalString="123450";
        StringBuilder startState=new StringBuilder("");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                startState.append(board[i][j]);
            }
        }
        Set<String> visited=new HashSet<>();
        Queue<String> q=new LinkedList<>();
        q.add(startState.toString());
        int l,moves=0;
        while(!q.isEmpty()){
            l=q.size();
            for(int i=0;i<l;i++){
                String currState=q.poll();
                if(currState.equals(finalString)){
                    return moves;
                }
                int zeroIdx=currState.indexOf('0');
                for(int newIdx:directions[zeroIdx]){
                    String nextState=swap(currState,zeroIdx,newIdx);
                    if(visited.contains(nextState)){
                        continue;
                    }
                    q.add(nextState);
                    visited.add(nextState);
                }
            }
            moves++;
        }
        return -1;
    }
}