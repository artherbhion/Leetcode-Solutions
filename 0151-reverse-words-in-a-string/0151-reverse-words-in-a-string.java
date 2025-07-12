class Solution {
    public String reverseWords(String s) {
        s.trim();
        String[] words=s.split("\\s+");
        StringBuilder  res=new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            String word = words[i].trim();
            res.append(word);
            if(i!=0)res.append(" ");
        }
        return res.toString().trim();
    }
}