class Solution {
    public int findChampion(int n, int[][] edges) {
        boolean[] only_strong=new boolean[n];
        Arrays.fill(only_strong,true);
        int num_edges=edges.length;

        for(int i=0;i<num_edges;i++)
        {
            int winner=edges[i][0];
            int losser=edges[i][1];
            only_strong[losser]=false;
        }

        int champion=-1;
        int champCount=0;
        for(int team=0;team<n;team++)
        {
            if(only_strong[team])
            {
                champion=team;
                champCount++;
            }
        }

        return champCount==1?champion:-1;
    }
}