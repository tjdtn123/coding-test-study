import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] answer = {};
        answer = Arrays.stream(myString.split("x")).sorted().
            filter(num -> !num.equals("")).toArray(String[] :: new);
        return answer;
    }
}