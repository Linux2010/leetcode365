from typing import List


class Solution:
    def maxArea(self, height: List[int]) -> int:
       l = 0
       r = size(height)-1
       ans =0
       while l < r:
            area = (r-l) * min(height[l],height[r])
            ans = max(ans , area)
            if height[l] < height[r] :
                l += 1
            else :
                r -= 1
       return ans
    # O(n) , O(1)