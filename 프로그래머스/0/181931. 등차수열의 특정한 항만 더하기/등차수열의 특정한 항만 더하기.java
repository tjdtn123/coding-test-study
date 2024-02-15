class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int[] intAry = new int[included.length];
        intAry[0] = a;
        for(int i = 1; i < included.length; i++){
            intAry[i] = intAry[i-1] + d;
        }
        
        for(int i = 0; i < included.length; i++){
            answer += included[i] ? intAry[i] : 0;
        } 
    
        return answer;
    }
}