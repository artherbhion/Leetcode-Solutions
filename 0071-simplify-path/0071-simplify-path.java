class Solution {
    public String simplifyPath(String path) {
        String[] patharr = path.split("/");
        Stack<String> st = new Stack<>();
        for (String i : patharr) {
            if (i.equals("") || i.equals(".")) {
                continue;
            }
            if (i.equals("..")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else {
                st.push(i);
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty()) {
            sb.insert(0,"/" + st.pop());
        }

        return sb.length() == 0 ? "/" : sb.toString();        
    }
}