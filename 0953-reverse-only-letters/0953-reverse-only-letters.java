class Solution {
    public String reverseOnlyLetters(String s) {
        int n = s.length(),i=0,j=0;
        StringBuilder sb = new StringBuilder();
        for(i=0;i<n;i++){
            if(Character.isAlphabetic(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        sb.reverse();
        StringBuilder res = new StringBuilder();
        for(i=0;i<n;i++){
            if(!Character.isAlphabetic(s.charAt(i))){
                res.append(s.charAt(i));
            }
            else{
                res.append(sb.charAt(j));
                j++;
            }
        }
        return res.toString();
    }
}