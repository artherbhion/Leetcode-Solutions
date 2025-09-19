public class Solution {
    public IList<string> GenerateParenthesis(int n) {
        IList<string> ls=new List<string>();
            back(n,0,0,ls,"");
            return ls;
        
    }
    public static void back(int n,int o,int c,IList<string> list,string str){
        if(str.Length==n*2){
            list.Add(str);
            return;
        }
        if(o<n){
            back(n,o+1,c,list,str+'(');
        }
        if(c<o){
            back(n,o,c+1,list,str+')');
        }
    }
}