class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list=new ArrayList<>();
        int n1=left,n2=right;
        for(int i=left;i<=right;i++){
            if(check(i))
            list.add(i);
        }
        return list;
    }
    public boolean check(int n){
        int digit=n;
        while(n>0){
            int div=n%10;
            if(div==0) return false;
            if(digit%div != 0) return false;
            n=n/10;
        }
        return true;
    }
}