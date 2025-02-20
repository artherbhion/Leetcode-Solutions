class Solution {
    public int maximumWealth(int[][] accounts) {
        int ms=0,sum=0;
        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[0].length;j++){
                sum=sum+accounts[i][j];
            }
            if(sum>ms){
                ms=sum;
            }
            sum=0;
        }
        return ms;
    }
}