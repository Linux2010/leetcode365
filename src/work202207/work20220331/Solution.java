package work202207.work20220331;

import java.util.LinkedList;

class Solution {
    public boolean isValid(String s) {
        if(s.length()%2 !=0){
            return false;
        }
        LinkedList l=new LinkedList();
        for(int i=0;i<s.length();i++){
            switch (String.valueOf(s.charAt(i))){
                case "(":
                case "{":
                case "[":
                    l.push(s.charAt(i));
                    break;
                case ")":
                    if(!"(".equals(l.pop())){
                        return false;
                    }
                    break;
                case "]":
                    if(!"[".equals(l.pop())){
                        return false;
                    }
                    break;
                case "}":
                    if(!"{".equals(l.pop())){
                        return false;
                    }
                    break;
            }
        }
        return l.isEmpty();
    }
}