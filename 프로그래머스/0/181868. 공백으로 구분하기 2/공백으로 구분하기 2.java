import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        
        String trimed = my_string.trim();
        List<String> list = new ArrayList<>();
        String[] splited = trimed.split(" ");
        
        for(int i = 0; i < splited.length; i++){
            if(!splited[i].equals("")){
                list.add(splited[i]);
            }
        }
        
        answer = list.toArray(new String[list.size()]);
        
        return answer;
    }
}