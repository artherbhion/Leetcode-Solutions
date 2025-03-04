class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        pragenerator(res,"",0,0,n);
        return res;
    }
    public static void  pragenerator(List<String> res,String str,int o,int c,int n){
        if(o+c==n*2){
            res.add(str);
            return;
        }
        if(o<n){
            pragenerator(res,str+"(",o+1,c,n);
        }
        if(c<o){
            pragenerator(res,str+")",o,c+1,n);
        }
    }
}