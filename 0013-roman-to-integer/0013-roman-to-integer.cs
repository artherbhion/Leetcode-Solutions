public class Solution {
    public int RomanToInt(string s) {
        Dictionary<char,int> map=new Dictionary<char , int>{
            {'I',1},
            {'V',5},
            {'X',10},
            {'L',50},
            {'C',100},
            {'D',500},
            {'M',1000}
        };
        int res=0;
        for(int i =0;i< s.Length-1;i++){
            if(map[s[i]]<map[s[i+1]]){
                res-=map[s[i]];
            }
            else{
                res+=map[s[i]];
            }
        }
        res+=map[s[s.Length-1]];
        return res;
    }
}