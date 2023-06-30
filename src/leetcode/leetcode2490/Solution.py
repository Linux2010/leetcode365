class Solution:
    def isCircularSentence(self, sentence: str) -> bool:
        if sentence[len(sentence)-1] != sentence[0]:
            return False
        arr=sentence.split(' ');
        i=0
        while(i<len(arr)-1):
            if arr[i][len(arr[i])-1] != arr[i+1][0]:
                return False
            i=i+1
        return True


res = Solution().isCircularSentence("los sfg gll")
print(res)