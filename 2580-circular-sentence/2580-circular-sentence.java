class Solution {
    public boolean isCircularSentence(String sentence) {
       if(sentence.charAt(0)!=sentence.charAt(sentence.length()-1)) return false;
       String arr[]=sentence.split(" ");
       for(int i=0;i<arr.length-1;i++){
        String s1=arr[i],s2=arr[i+1];
        if(s1.charAt(s1.length()-1)!=s2.charAt(0)) return false;
       }
       return true; 
    }
}