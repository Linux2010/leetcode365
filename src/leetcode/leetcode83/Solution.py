# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
from typing import Optional
from leetcode.leetcode83.ListNode import ListNode
class Solution:
    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:
        node = head
        index = head
        while node is not None:
            node = node.next
            if node.val is not None and  index.val == node.val :
                index.next = node.next
            else:
                index = node.next
        return head

       # O(n),O(1)