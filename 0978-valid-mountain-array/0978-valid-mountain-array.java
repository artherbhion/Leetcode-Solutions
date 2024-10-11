class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3){
            return false;
        }
        int c=0;
        for(int i=1;i<arr.length-1;i++){
            if(arr[i-1]<arr[i] && arr[i+1]<arr[i]){
                c++;
            }            
            if(arr[i]==arr[i+1]){
                return false;
            }
            if(arr[i]<arr[i-1]&&arr[i]<arr[i+1] &&c==0){
                return false;
            }
        }
        if(arr[arr.length-1]>arr[arr.length-2] && c==1){
            c++;
        }
        return c==1?true:false;
    }
}