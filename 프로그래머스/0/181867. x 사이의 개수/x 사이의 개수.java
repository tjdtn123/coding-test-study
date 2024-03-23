import java.util.*;
class Solution {
    public int[] solution(String myString) {
        String[] splited = myString.split("x");
        List<String> list = new ArrayList<>(Arrays.asList(splited));
        
        if (myString.endsWith("x")) {
            list.add("");
        }
        
        int[] answer = list.stream().mapToInt(String::length).toArray();
        
        return answer;
    }
}