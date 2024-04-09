import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int getpo = (nums.length)/2;
        Map<Integer,Integer> map = new HashMap<>();
        for(int p_code : nums){
            map.put(p_code,map.getOrDefault(p_code,0)+1);
        }
        for(int p_code : map.keySet()){
            answer++;
        }
        if(answer > getpo){
            answer = getpo;
        }
        
        return answer;
    }
}