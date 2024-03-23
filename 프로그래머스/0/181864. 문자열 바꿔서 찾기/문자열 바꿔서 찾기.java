class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        StringBuilder sb = new StringBuilder();
        String[] strarr = myString.split("");
        
        for(String str : strarr){
            if(str.equals("A")){
                sb.append("B");
            }else{
                sb.append("A");
            }
        }
        
        if(sb.toString().contains(pat)){
            answer += 1;
        }
        
        return answer;
    }
}