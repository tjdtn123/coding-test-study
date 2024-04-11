class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        
        int odd = 0;
        int even = 0;
        
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 0) even += 1;
            else odd += 1;
        }
        
        answer = new int[]{even,odd};
        return answer;
    }
}