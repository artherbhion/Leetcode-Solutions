class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generator(result,"",0,0,n);
        return result;
    }
    public static void generator(List<String> result,String ans,int o,int c,int n){
        if(o+c==n*2){
            result.add(ans);
            return ;
        }
        if(o<n){
           generator(result,ans+"(",o+1,c,n);
        }
        if(c<o){
            generator(result,ans+")",o,c+1,n);
        }
    }
}