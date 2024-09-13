class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int l=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                l++;
            }
            else{
                break;
            }
        }
        System.out.print(s);
        return l;
    }
}