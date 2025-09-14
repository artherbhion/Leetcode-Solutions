public class Solution {
    public string LongestCommonPrefix(string[] strs) {
        if (strs == null || strs.Length == 0)
            return "";
        Array.Sort(strs);
        string s1=strs[0];
        string s2=strs[strs.Length-1];
        int i=0;
        string ans="";
        while (i < s1.Length && i < s2.Length && s1[i] == s2[i]){
            ans+=s1[i++];
        }
        return ans;
    }
}