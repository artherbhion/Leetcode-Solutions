class Solution {
    public int minimumTime(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[2]-b[2]);  // Array: row, col, value
        boolean[][] visited=new boolean[m][n];
        

        if (grid[0][1] > 1 && grid[1][0] > 1){           
            return -1;
        }

        int[][] moves={ {0,-1},{0,1},{-1,0},{1,0}};

        pq.add(new int[]{0,0,0});
        while(!pq.isEmpty()){
            int[] arr=pq.poll();
            int row=arr[0];
            int col=arr[1];
            int time=arr[2];
            
            if(row==m-1 && col==n-1){
                return time;
            } 

            if(visited[row][col]) continue;
            visited[row][col]=true;


            for(int[] move:moves){
                int nrow=row+move[0];
                int ncol=col+move[1];

                if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && !visited[nrow][ncol]){
                    int newtime=0; 
                    
                    // if(time+1>=grid[nrow][ncol]) newtime=time+1;
                    // else if((grid[nrow][ncol]-time)%2==0) newtime=grid[nrow][ncol]+1; //even
                    // else newtime=grid[nrow][ncol]; //odd

                    int diff=grid[nrow][ncol]-time;                    
                    if(diff<=1) newtime=time+1;                
                    else newtime=time+1+(diff/2)*2;

                    pq.add(new int[]{nrow,ncol,newtime});
                    
                }
            }


        }

        return -1;
    }
}