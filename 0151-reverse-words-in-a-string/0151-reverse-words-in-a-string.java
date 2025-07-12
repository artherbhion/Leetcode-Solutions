class Solution {
    public String reverseWords(String s) {
        s.trim();
        String[] words=s.split("\\s+");
        String res="";
        for(int i=words.length-1;i>=0;i--){
            String word = words[i].trim();
            res+=word+" ";
        }
        return res.trim();
    }
}