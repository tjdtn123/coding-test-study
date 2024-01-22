class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String ab = "" + a + b;        
        String ba = "" + b + a;
        
        int abInt = Integer.valueOf(ab);
        int baInt = Integer.valueOf(ba);
        
        if(abInt >= baInt){
            answer = abInt;
        } else {
            answer = baInt;
        }
            
        return answer;
    }
}