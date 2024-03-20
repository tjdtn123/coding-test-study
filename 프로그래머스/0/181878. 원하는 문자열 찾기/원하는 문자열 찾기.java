class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        if(myString.length() < pat.length()){
            return answer;
        }
        String my_low = myString.toLowerCase();
        String pat_low = pat.toLowerCase();
        if(my_low .contains(pat_low)){
            answer += 1;
        }
        
        
        return answer;
    }
}