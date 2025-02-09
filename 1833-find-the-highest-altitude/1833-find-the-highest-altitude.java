class Solution {
    public int largestAltitude(int[] gain) {
        int maxAltitude = 0;
        for(int i = 1; i < gain.length; i++){
            gain[i] = gain[i-1] + gain[i];
        }
        for(int altitude : gain){
            if(altitude > maxAltitude)
                maxAltitude = altitude;
        }
        return maxAltitude;
    }
}