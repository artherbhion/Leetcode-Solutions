class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].length()>1 || Character.isDigit(tokens[i].charAt(0))) {
                int num = Integer.parseInt(tokens[i]);
                st.push(num);
            } 
            else if(!st.isEmpty()){
                int y = st.pop();
                if(!st.isEmpty()){
                int x = st.pop();
                if (tokens[i].equals("+")) {
                    st.push(x + y);
                    System.out.print(st.peek());
                } else if (tokens[i].equals("-")) {
                    st.push(x - y);
                    System.out.print(st.peek());

                } else if (tokens[i].equals("*")) {
                    st.push(x * y);
                    System.out.print(st.peek());

                } else if (tokens[i].equals("/")){
                    st.push(x / y);
                    System.out.print(st.peek());

                }
                }
            }
        }
        return !st.isEmpty()?st.pop():0;
    }
}
