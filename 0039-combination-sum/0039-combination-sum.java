class Solution {
    public List<List<Integer>> combinationSum(int[] c, int t) {
        List<List<Integer>> res= new ArrayList<>();
        Arrays.sort(c);
        back(c,t,0,res,new ArrayList<>());
        return res;
    }
    public void back(int[] c,int t,int s,List<List<Integer>> res,List<Integer> cur){
        if(t==0){
            res.add(new ArrayList<>(cur));
            return;
        }
        for(int i=s;i<c.length;i++){
            if(c[i]>t){
                break;
            }
            cur.add(c[i]);
            back(c,t-c[i],i,res,cur);
            cur.remove(cur.size()-1);
        }
    }
}