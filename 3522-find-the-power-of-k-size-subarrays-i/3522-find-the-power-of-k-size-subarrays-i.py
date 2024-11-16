class Solution:
    def resultsArray(self, nums: List[int], k: int) -> List[int]:
        n = len(nums)
        ans = []
        
        for i in range(n - k + 1):
            subarray = nums[i:i + k]
            is_sorted_consecutive = True
            for j in range(1, k):
                if subarray[j] != subarray[j - 1] + 1:
                    is_sorted_consecutive = False
                    break
            if is_sorted_consecutive:
                ans.append(max(subarray))
            else:
                ans.append(-1)
        
        return ans
