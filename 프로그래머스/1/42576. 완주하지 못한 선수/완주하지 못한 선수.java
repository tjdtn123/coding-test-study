import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        int idx = 0;
        for(int i = 0; i < completion.length; i++){
            if(!participant[idx].equals(completion[idx])){
                break;
            } else {
                idx++;
            }
        }
        
        return participant[idx];
    }
}