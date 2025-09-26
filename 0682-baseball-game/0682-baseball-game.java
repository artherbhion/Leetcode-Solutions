class Solution {
    public int calPoints(String[] op) {
        Stack<Integer> st=new Stack<>();        
        for(int i=0;i<op.length;i++){
            if(!op[i].equals("+") && !op[i].equals("C") && !op[i].equals("D")){
                st.push(Integer.parseInt(op[i]));
                System.out.print(Integer.parseInt(op[i]));
            }
            else{
                if(op[i].equals("+")){
                    int a=0,b=0;
                    if(!st.isEmpty()) a=st.pop();
                    if(!st.isEmpty()) b=st.pop();
                    st.push(b);
                    st.push(a);
                    st.push(a+b);
                }
                if(op[i].equals("D")){
                    st.push(st.peek()*2);
                }
                if(op[i].equals("C")){
                    st.pop();
                }
            }
        } 
        int sum=0;
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;
    }
}