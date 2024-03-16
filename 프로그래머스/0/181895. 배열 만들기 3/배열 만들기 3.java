import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> list = new ArrayList<>();
        
        int[] a = intervals[0];
        int[] b = intervals[1];
        
        for(int i = a[0]; i <= a[1]; i ++){
            list.add(arr[i]);
        }
        for(int i = b[0]; i <= b[1]; i++){
           list.add(arr[i]);
        }
        int[] answer = new int[list.size()];
        for(int i = 0 ; i < list.size(); i++){
            answer[i] = list.get(i);
        }      
        
        
        return answer;
    }
}