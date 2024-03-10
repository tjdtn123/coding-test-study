class Solution {
    public int solution(String number) {
        int answer = 0;
        int total = 0;
        String[] arr = number.split("");     
        for(String num : arr){
            total += Integer.parseInt(num);
        }
        answer = total % 9;
        
        return answer;
    }
}