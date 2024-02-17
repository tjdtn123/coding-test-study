class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String even = "";
        String odd = "";
        int flag = 0;
        for(int i = 0; i < num_list.length; i++){
            if(num_list[i] % 2 == 1){
                even += String.valueOf(num_list[i]);
                flag++;
            }else {
                odd += String.valueOf(num_list[i]);
                flag--;
            }
        }
        answer = Integer.parseInt(even) + Integer.parseInt(odd);
        
        
        
        return answer;
    }
}