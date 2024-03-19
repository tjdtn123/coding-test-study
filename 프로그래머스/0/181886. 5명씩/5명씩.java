class Solution {
    public String[] solution(String[] names) {
        String[] answer = {};
        int len = names.length/5;
        int idx = 0;
        if(names.length%5 == 0){
            answer = new String[len];
        }else{
            answer = new String[len+1];
        }
        
        for(int i = 0; i < names.length; i += 5){
            answer[idx] = names[i];
            idx++;
        }
        
        return answer;
    }
}