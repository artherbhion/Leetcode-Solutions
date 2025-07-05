class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String str1=strs[0];
        String str2=strs[strs.length-1];
        int e=Math.min(str1.length(),str2.length());
        String res="";
        int i=0;
        while(i<e){
            if(str1.charAt(i)==str2.charAt(i)){
                res+=str1.charAt(i);
            }
            else break;
            i++;
        }
        return res;
    }
}