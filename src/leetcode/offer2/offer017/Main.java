package leetcode.offer2.offer017;

import java.util.HashMap;

class Main {
    //考虑t重复性的问题。
    public String work(String s, String t) {
        String res ="";
        //1，将t进行hash，并考虑t重复的情况
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            Character key =t.charAt(i);
            map.put(key,map.getOrDefault(key,0)+1);
        }
        //2，一层for循环s。
        for (int i = 0; i < s.length(); i++) {
            String tmpRes = "";
            //拷贝map到临时tmpMap
            HashMap<Character, Integer> tmpMap = new HashMap<>(map);
            //3，二层for，清除tmpMap直到为空。记录 start到end的subString
            if(tmpMap.containsKey(s.charAt(i))){
                for (int j = i; j < s.length(); j++) {
                    if(tmpMap.containsKey(s.charAt(j))){
                        Character key =s.charAt(j);
                        Integer value = tmpMap.get(key);
                        if(value>1){
                            tmpMap.put(key,value-1);
                        }else {
                            tmpMap.remove(key);
                        }
                    }
                    if(tmpMap.isEmpty()){
                        tmpRes=s.substring(i,j+1);
                        break;
                    }
                }
            }
            //4，如果tmpRes为空，直接返回
            if(tmpRes.equals("")){
                continue;
            }
            if(!res.equals("")){
                res = tmpRes.length()<res.length()?tmpRes:res;
            }else {
                res = tmpRes;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new Main().work("ADOBECODEBANC","ABC"));
        System.out.println(new Main().work("aa","aa"));
    }
}