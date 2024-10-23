class Solution {
    public int distinctIntegers(int n) {
         Set<Integer> hash_Set = new HashSet<>();
        while( n>0){
            for(int i=1; i<n; i++){
                if(n%i==1){
                    hash_Set.add(i);
                }
            }
            n--;
        }
        return hash_Set.size()+1;
    }
}