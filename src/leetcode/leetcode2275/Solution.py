from typing import List


class Solution:
    def largestCombination(self, candidates: List[int]) -> int:
        ans = [0] * 24
        for v in candidates:
            i = 0
            while v > 0:
                ans[i] += v & 1
                v >>= 1
                i += 1
        return max(ans)


if __name__ == '__main__':
    input = [16, 17, 71, 62, 12, 24, 14]
    ans = Solution().largestCombination(input)
    print(ans)
