from collections import defaultdict
from typing import List


"""
学习使用defaultdict，sorted，d.append list()
"""
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        d = defaultdict(list)
        for s in strs:
            d[''.join(sorted(s))].append(s)
        return list(d.values())

if __name__ == '__main__':
    strs = ["eat","tea","tan","ate","nat","bat"]
    list = Solution().groupAnagrams(strs)
    print(list)