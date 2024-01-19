class Solution:
    def threeSumClosest(self, nums: List[int], target: int) -> int:
        nums.sort()
        n = len(nums)
        min_diff = inf
        #最小的三位加起来大于target
        if nums[0] + nums[1] + nums[2] >= target :
            return nums[0] + nums[1] + nums[2]
        #最大的三位加起来小于target
        if nums[n-1] + nums[n-2] + nums[n-3] <= target:
            return nums[n-1] + nums[n-2] + nums[n-3]
        for i in range(n-2):
            x = nums[i]
            # 双指针
            j, k = i + 1, n - 1
            while j < k:
                s = x + nums[j] + nums[k]
                if s == target:
                    return s
                if s > target:
                    if s - target < min_diff:  # s 与 target 更近
                        min_diff = s - target
                        ans = s
                    k -= 1
                else:  # s < target
                    if target - s < min_diff:  # s 与 target 更近
                        min_diff = target - s
                        ans = s
                    j += 1
        return ans


        ##123

