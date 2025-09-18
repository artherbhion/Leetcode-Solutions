public class Solution {
    public string SimplifyPath(string path) {
        string[] str=path.Split('/');
        StringBuilder sb=new StringBuilder();
        Stack<string> st=new Stack<string>();
        for(int i=0;i<str.Length;i++){
            if(str[i]=="" || str[i]=="." ){
                continue;
            }
            else if(str[i]==".." ){
               if(st.Count!=0) st.Pop();
            }
            else{
                st.Push(str[i]);
            }
        }
        if(st.Count==0)return "/";
        while(st.Count>0){
            if(st.Count!=0){
                sb.Insert(0,st.Pop());
                sb.Insert(0,"/");
            }
        }
        return sb.ToString();
    }
}