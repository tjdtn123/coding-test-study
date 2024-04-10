class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int idx = 0;
        answer = new int[num_list.length];
        
        for(int i = num_list.length - 1; i >= 0; i--){
            answer[idx++] = num_list[i];
        }
        
        return answer;
    }
}