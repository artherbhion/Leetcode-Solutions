class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
        int n1 = nums1.size(), n2 = nums2.size();
        int i = 0, j = 0, start = 0;
        vector<int> mergedArray(n1+n2);
        while(i < n1 && j < n2){
            if(nums1[i] < nums2[j]){
                mergedArray[start++] = nums1[i++];
            }
            else{
                mergedArray[start++] = nums2[j++];
            }
        }

        while(i < n1){
            mergedArray[start++] = nums1[i++];
        }

        while(j < n2){
            mergedArray[start++] = nums2[j++];
        }

        int m = mergedArray.size();
        int mid = 0 + (m-1)/2;
        if(m % 2 != 0){
            return mergedArray[mid];
        }

        return (double)(mergedArray[mid] + mergedArray[mid+1])/2;
    }
};
