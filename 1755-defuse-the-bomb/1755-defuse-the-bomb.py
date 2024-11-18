class Solution:
    def decrypt(self, a: List[int], k: int) -> List[int]:
        return [sum(a[(i+j)%len(a)] for j in range(*((k,0),(1,k+1))[k>0])) for i in range(len(a))]