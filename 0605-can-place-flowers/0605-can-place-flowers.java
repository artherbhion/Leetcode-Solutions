public class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for(int i = 0; i < flowerbed.length && n>0; i++) {
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
                   n--;
               }
            }
        }
        if(n==0){
            return true;
        }
        
        return false;
    }
}