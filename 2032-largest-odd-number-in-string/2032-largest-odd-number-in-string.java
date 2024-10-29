class Solution {
    public String largestOddNumber(String num) {
        for(int i = num.length()-1; i >= 0; i--){
            char ch = num.charAt(i);
            int c = Character.getNumericValue(ch);
            if(c%2 == 1){
                return num.substring(0, i+1);
            }
        }
        return "";
    }
}