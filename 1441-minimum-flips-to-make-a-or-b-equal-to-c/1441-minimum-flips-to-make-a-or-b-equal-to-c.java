class Solution {
    public int minFlips(int a, int b, int c) {
       int co=0,s=0;
       int max=Math.max(a,Math.max(b,c));
       while((1<<s)<=max){
        int abit=1&(a>>s);
        int bbit=1&(b>>s);
        int cbit=1&(c>>s);
        if(cbit==1){
            if(abit==0&&bbit==0){
                co++;
            }
        }
        else{
            if(abit==1&&bbit==1){
                co+=2;
            }
            else if(abit==1 || bbit==1){
                co++;
            }
        }
        s++;
       }return co;
    }
}