class Solution {
    public String removeStars(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                stack.pop();
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        // StringBuilder s2=new StringBuilder();
        // while(!stack.isEmpty()){
        //     s2.append(stack.pop());
        // }
        // s2.reverse();
        // String r=s2.toString();
        // return r;
        int k=stack.size()-1;
        char[] res = new char[stack.size()];
         while(stack.size() > 0) res[k--] = stack.pop();
        return new String(res);
    }
}