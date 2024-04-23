class Solution {
    public int solution(int n) {       
        int answer = 0;    
        int idx = 1;
        while(true){
            int fac = factorial(idx);
            if(n < fac){
                answer = idx;
                break;
            }
           idx++;
        }
        
        return answer-1;
    }
    
    public int factorial(int num){
            if(num == 1){
                return 1;
            }
        
        return num * factorial(num - 1);
    }
}