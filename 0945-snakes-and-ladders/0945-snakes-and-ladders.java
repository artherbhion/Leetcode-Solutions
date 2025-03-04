class Solution {
    public int snakesAndLadders(int[][] board) {
        int n = board.length;
        int[] arr = new int[n * n];
        int r = n - 1, c = 0, diff = 1;
        
        for (int i = 0; i < n * n; i++) {
            arr[i] = board[r][c];  
            c += diff;            
            if (c == -1 || c == n) {  
                c = (diff == 1) ? n - 1 : 0;  
                diff = -diff;  
                r--;  
            }
        }
        
        int[] moves = new int[n * n];
        Arrays.fill(moves, Integer.MAX_VALUE);
        Queue<Integer> q = new LinkedList<>();
        
        q.offer(0);
        moves[0] = 0;
        
        while (!q.isEmpty()) {
            int sq = q.poll();
            for (int nsq = sq + 1; nsq <= Math.min(sq + 6, n * n - 1); nsq++) {
                int dest = arr[nsq] == -1 ? nsq : arr[nsq] - 1;
                if (moves[dest] == Integer.MAX_VALUE) {
                    moves[dest] = moves[sq] + 1;
                    q.offer(dest);
                }
            }
        }
        
        return moves[n * n - 1] == Integer.MAX_VALUE ? -1 : moves[n * n - 1];
    }
}
