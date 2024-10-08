class Solution {
    public String reverseWords(String s) {
        String res="";
        String words[]=s.trim().split("\\s+",0);
        for(int i=words.length-1;i>=0;i--){
            res=res+" "+words[i];
        }
        return res.trim();
    }
}