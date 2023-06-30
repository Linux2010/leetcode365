package leetcode.leetcode2490;
//2490. Circular Sentence
// https://leetcode.cn/problems/circular-sentence/
class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] arr = sentence.split(" ");
        if(sentence.charAt(0)!=sentence.charAt(sentence.length()-1)) return false;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i].charAt(arr[i].length()-1)!=arr[i+1].charAt(0)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(new Solution().isCircularSentence("LOl lal lsa asL"));
        
    }
}