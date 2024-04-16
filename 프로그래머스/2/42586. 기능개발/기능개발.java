import java.util.*;
import java.math.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int[] done = new int[progresses.length];
        int cnt = 0;
        int idx = 0;
        
        for(int i = 0; i < done.length; i++){
            done[i] = (100 - progresses[i]) / speeds[i];
            if((100 - progresses[i]) % speeds[i] != 0){
                done[i] += 1;
            }
        }
        
        while(cnt < done.length){
            for(int i = 0; i < done.length; i++){
                done[i] -= 1;
                if(done[i] <= 0 && idx == i){
                    stack.push(1);
                    cnt++;
                    idx++;
                }
            }
            
            if(stack.size() > 0){
                list.add(stack.size());
                stack.removeAllElements();
            }
            
        }
        
        return list.stream().mapToInt(Integer :: intValue).toArray();
    }
}