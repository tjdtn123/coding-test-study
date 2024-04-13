import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] emergencySort = emergency.clone();
        
        Arrays.sort(emergencySort);
        int size = emergency.length;
        
        for(int i = 0; i<size; i++){
            map.put(emergencySort[i], size-i);
        }
        for(int i = 0; i<emergency.length; i++){
            emergency[i] = map.get(emergency[i]);
        }
        return emergency;
    }
}