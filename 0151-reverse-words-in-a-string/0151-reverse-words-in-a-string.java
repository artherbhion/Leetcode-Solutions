class Solution {
    public String reverseWords(String s) {
        String res="";
        s.trim();
        char[] str=s.toCharArray();
        Stack<String> st=new Stack<>();
        for(int i=0;i<s.length();){
            if(str[i]!=' '){
                String temp="";
                while( i <s.length() && str[i]!=' '){
                    temp=temp+str[i];
                    i++;
                }
                st.push(temp);
            }else i++;
        }
        while (!st.isEmpty()) {
            res += st.pop() + " ";
        }
        return res.trim();
    }
}
