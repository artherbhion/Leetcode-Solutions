class Solution {
    public int distributeCandies(int[] candyType) {
        Set <Integer> st=new HashSet<>();
        for(int num:candyType)
        {
            st.add(num);

        }
        if(st.size()==1)
        return 1;
        int num1=candyType.length/2;

        if(st.size()>=num1)
        return num1;
        else
        return st.size();
        
    }
}