class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        String[] strAry1 = str1.split("");
        String[] strAry2 = str2.split("");
        
        for(int i = 0; i < str1.length(); i++){
            answer += strAry1[i] + strAry2[i];
        }
        
        return answer;
    }
}