class Solution {
    public boolean isCircularSentence(String sentence) {
         String str = sentence;
         int c=0;
         for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                c++;
                if(str.charAt(i-1)!=str.charAt(i+1)){
                    return false;
                }
            }
         }
         if(c==0 && str.charAt(0)!=str.charAt(str.length()-1)){
            return false;
         }
         if(str.charAt(0)!=str.charAt(str.length()-1)){
            return false;
         }
         return true;
    }
}