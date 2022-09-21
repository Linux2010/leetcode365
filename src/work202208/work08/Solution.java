package work202208.work08;

//392. 判断子序列

import java.util.HashMap;

public class Solution {

    //双指针
    public boolean isSubsequence(String s, String t) {

        if(s.length()==0){
            return true;
        }
        if(s.length()>t.length()){
            return false;
        }

        int flag = 0 ;
        for (int i = 0; i < t.length(); i++) {
            if(flag!=s.length()&&t.charAt(i)==s.charAt(flag)){
                flag++;
            }
        }
        return flag == s.length();
    }
}
