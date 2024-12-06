class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int hindex=0,h=citations.length;
         for (int i=0; i<citations.length; i++){
            if (citations[i]>= h-i){
                hindex = Math.max(hindex,h-i);
               
            }
         } return hindex;
    }
}