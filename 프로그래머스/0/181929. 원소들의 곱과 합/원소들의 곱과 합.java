class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int me = 1;
        int se = 0;
        
        for(int elem : num_list){
            me *= elem;
        }
        
        for(int elem : num_list){
            se += elem;
        }
               
        answer = me < (se*se) ? 1 : 0;        
        
       
        return answer;
    }
}