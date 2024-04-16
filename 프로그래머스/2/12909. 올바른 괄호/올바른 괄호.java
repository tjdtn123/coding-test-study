import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = false;
        Stack<String> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                stack.push("(");  
            }else if(!stack.isEmpty()){
                stack.pop();
            }                         
        }
        
        if(s.charAt(0) == '(' && s.charAt(s.length()-1) == ')' && stack.size() == 0){
            answer = true;
        }
        

        return answer;
    }
}