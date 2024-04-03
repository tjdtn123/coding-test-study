import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<>();
        for(int elem : arr){
            list.add(elem);
        }
        for(int p : delete_list){
           list.removeIf(s -> s == p); 
        }
        
        return list.stream().mapToInt(Integer :: intValue).toArray();
    }
}