import java.util.*;
class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        String flag = "";
        int idx = 0;      
       
        for(int i = 0; i < str_list.length; i++){
            if(str_list[i].equals("l") || str_list[i].equals("r")){
                flag += str_list[i];
                idx = i;
                break;
            }
        }
        System.out.println(flag);
        if(flag.equals("l")){
            answer = Arrays.copyOfRange(str_list, 0, idx);
        }else{
            answer = Arrays.copyOfRange(str_list, idx+1, str_list.length);
        }
        
        
        return answer;
    }
}