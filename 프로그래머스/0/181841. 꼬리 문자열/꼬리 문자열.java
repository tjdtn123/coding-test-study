class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        
        for(String elem : str_list){
            if(!elem.contains(ex)){
                answer += elem;
            }
        }
        
        return answer;
    }
}