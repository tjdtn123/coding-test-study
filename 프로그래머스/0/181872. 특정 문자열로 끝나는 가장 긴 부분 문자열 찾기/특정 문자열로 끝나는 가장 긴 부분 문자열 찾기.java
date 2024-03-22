class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int idx = 0;
        String[] arr = new String[myString.length()];
        for(int i = arr.length-1; i >= 0; i--){
            arr[idx] = myString.substring(0,i+1);
            if(arr[idx].endsWith(pat)){
                answer = arr[idx];
                break;
            }else{
                idx++;
            }
        }
        
        return answer;
    }
}