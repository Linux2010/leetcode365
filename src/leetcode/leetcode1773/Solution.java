package leetcode.leetcode1773;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

//1773. 统计匹配检索规则的物品数量
public class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("type",0);
        map.put("color",1);
        map.put("name",2);
        int i = map.get(ruleKey);
        AtomicInteger res = new AtomicInteger();
        items.forEach(item->{
            if(ruleValue.equals(item.get(i))){
                res.getAndIncrement();
            }
        });
        return res.get();
    }
}
