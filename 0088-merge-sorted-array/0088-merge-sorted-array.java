class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l=m+n-1;
        n--;
        m--;
        while(n>=0 && m>=0){
            if(nums2[n]>nums1[m]){
                 nums1[l]=nums2[n--];
            }
            else{
                nums1[l]=nums1[m--];
            }
            l--;
        }
        while (n>=0) {
            nums1[l--]=nums2[n--];
        }
    }
}