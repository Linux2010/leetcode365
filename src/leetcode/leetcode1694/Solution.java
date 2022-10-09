package leetcode.leetcode1694;
//https://leetcode.cn/problems/reformat-phone-number/
//1694. 重新格式化电话号码
public class Solution {
    public String reformatNumber(String number) {
        StringBuffer res = new StringBuffer();
        int tmp = 0;
        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            if(c=='-'||c==' '){
                continue;
            }else {
                tmp++;
                res.append(c);
            }
            if(tmp==3){
                res.append('-');
                tmp=0;
            }
        }
        if(tmp==1){
            char num = res.charAt(res.length()-2);
            char num1 = res.charAt(res.length()-3);
            res.replace(res.length()-3,res.length()-1,String.valueOf(num)+String.valueOf(num1));
        }
        if(tmp==0){
            res.replace(res.length()-1,res.length(),"");
        }
        return res.toString();

    }
}
