class Solution {
    public boolean isPalindrome(String s) {
     char[] str  = s.toCharArray();
     String s1="";
     for(int i=0;i<str.length;i++){
        char c=Character.toLowerCase(str[i]);
        if((c>='a' && c<='z')||(c>='0' && c<='9'))s1+=c;
     }
     System.out.print(s1);
    //  if(s1.length()==1)return false;
    
    int l=0,r=s1.length()-1;
    while(l<r){
        if(s1.charAt(l)!=s1.charAt(r))return false;
        l++;
        r--;
    }
    return true;
    }
}

