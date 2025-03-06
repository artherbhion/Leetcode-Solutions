class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                    map.put(grid[i][j],map.getOrDefault(grid[i][j],0)+1);
            }
        }
        int a=0,b=0,n=grid.length;
        for(int i=1;i<=n*n;i++){
            if(!map.containsKey(i)){
                b=i;
            }
            else if(map.get(i)==2 ){
                a=i;
            }
        }
        int arr[]=new int[2];
        arr[0]=a;
        arr[1]=b;
        return arr;
    }
}