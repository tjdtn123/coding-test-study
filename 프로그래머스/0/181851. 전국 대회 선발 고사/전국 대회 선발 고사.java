import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
              
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < rank.length; i++){
            if(attendance[i]){
                map.put(rank[i], i);
            }
        }
        
        for(Integer p : map.keySet()){
            list.add(p);
        }        
        Collections.sort(list);
        
        return 10000 * map.get(list.get(0)) + 100 * map.get(list.get(1)) + map.get(list.get(2));
        
    }
}