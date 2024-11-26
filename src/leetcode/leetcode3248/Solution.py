from typing import List


class Solution:
    def finalPositionOfSnake(self, n: int, commands: List[str]) -> int:
        i = 0
        j = 0
        for c in commands:
            if c[0] == 'U':
                j = j-1
            if c[0] == 'D':
                j = j+1
            if c[0] == 'R':
                i = i+1
            if c[0] == 'L':
                i = i-1
        return j*n + i

if __name__ == '__main__':
    list = ["RIGHT","DOWN"]
    res = Solution().finalPositionOfSnake(2,list)
    print(res)
