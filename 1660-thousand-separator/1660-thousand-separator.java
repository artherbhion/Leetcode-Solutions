class Solution {
        public String thousandSeparator(int n) {
        String num = String.valueOf(n);  
        StringBuilder sb = new StringBuilder(); 
        for (int i = 0; i < num.length(); i++) {
            if (i != 0 && (num.length() - i) % 3 == 0) {  
                sb.append(".");
            } 
            sb.append(num.charAt(i));  
        }
        return sb.toString();
    }
}