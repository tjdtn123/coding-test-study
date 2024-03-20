class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        String[] a = my_string.split("");
        for(int i = 0; i < a.length; i++){
            if(a[i].equals(alp)){
                a[i] = a[i].toUpperCase();
                answer += a[i];
            }else{
                answer += a[i];
            }
        }
        return answer;
    }
}