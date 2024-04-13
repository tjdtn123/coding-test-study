class Solution {
    public String solution(int age) {
        String answer = "";
        
        String str = String.valueOf(age);
        
        for(int i = 0; i < str.length(); i++){
            // 숫자에 해당하는 알파벳을 계산하여 바로 결과 문자열에 추가
            char alphabet = (char) (str.charAt(i) - '0' + 'a');
            answer += alphabet;
        }
        
        return answer;
    }
}