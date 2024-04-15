import java.util.*;
class Solution {
    public String solution(String rsp) {
       
        Map<String,String> map = new HashMap<>();
        map.put("2","0");
        map.put("0","5");
        map.put("5","2");
        String[] sp = rsp.split("");
        StringBuilder sb = new StringBuilder();
        
        for(String elem : sp){
            sb.append(map.get(elem));
        }
        
        return sb.toString();
    }
}