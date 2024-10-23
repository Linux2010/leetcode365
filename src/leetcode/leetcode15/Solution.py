from typing import List


class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        # 三元组的顺序不重要
        # i<j<k
        # 答案中不可以包含重复的三元组
        ans = []
        n = len(nums)
        for i in range(n-2):
            x = nums[i]
            if i>0 and x == nums[i-1]:
                continue
            if x + nums[i+1] + nums[i+2]>0 :
                break
            if x + nums[n-2] +nums[n-1]<0:
                continue
            j = i+1
            k = n-1
            while j <k:
                r = x+ nums[j] + nums[k]
                if r >0:
                    k = k -1
                elif r <0:
                    j = j +1
                else:
                    ans.append([x,nums[j],nums[k]])
                    j+=1
                    while j<k and nums[j]==nums[j-1]:
                        j+=1
                    k-=1
                    while k>j and nums[k]==nums[k+1]:
                        k -= 1
        return ans