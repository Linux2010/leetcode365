import java.util.*;

class Solution {
    public int maximumPopulation(int[][] logs) {

        int[] peopleCount = new int[3000];
        //1,生成一个以年为key ，count为value的数组
        //2,for循环判断 logs【i】，添加count数量
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int[] log : logs) {
            int i = log[0];
            while (i < log[1]) {
                if (map.containsKey(log[0])) {
                    map.put(log[0], map.get(log[0]) + 1);
                } else {
                    map.put(log[0], 1);
                }
                i++;
            }
        }
        // 输出
        int maxPeople = peopleCount[1950];
        int whichYear = 1950;
        for(int i = 1951; i < 2051; i++){
            if(peopleCount[i] > maxPeople){
                maxPeople = peopleCount[i];
                whichYear = i;
            }
        }
        return whichYear;

    }

    public int[] twoSum(int[] nums, int target) {
        for (int i=0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }




    public boolean areAlmostEqual(String s1, String s2) {
        List<Character> charList = new ArrayList<>();
        for (int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                charList.add(s1.charAt(i));
                charList.add(s2.charAt(i));
            }
            if (charList.size()>4){
                return false;
            }
        }
        if(charList.size()==0){
            return true;
        }
        if (charList.size()==2){
            return false;
        }
        if(charList.get(0)==charList.get(3)&&charList.get(1)==charList.get(2)){
            return true;
        }else {
            return false;
        }

    }
}
