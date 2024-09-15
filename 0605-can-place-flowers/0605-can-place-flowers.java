public class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for(int i = 0; i < flowerbed.length; i++) {
            int next=2,pre=2;
            if(flowerbed[i] == 0) {
                if(i==flowerbed.length-1){
                     next=0;
                }
                else{
                     next=flowerbed[i + 1];
                }
                if(i==0){
                     pre=0;
                }
                else{
                     pre=flowerbed[i-1];
                }
               if(next == 0 && pre == 0) {
                   flowerbed[i] = 1;
                   count++;
               }
            }
        }
        if(count>=n){
            return true;
        }
        
        return false;
    }
}