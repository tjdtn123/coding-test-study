class Solution {
    public String solution(String myString) {
        String answer = "";
        String b = myString.toLowerCase();
        String[] a = b.split("");
        for(int i = 0; i < a.length; i++){
            if(a[i].equals("a")){
                a[i] = a[i].toUpperCase();
                answer += a[i];
            }else {
                answer += a[i];
            }
        }
        System.out.println(answer);
        return answer;
    }
}