class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        String[] arr = myString.split("");
        for(int i = 0; i < arr.length; i++){
            if(myString.charAt(i) < 'l'){
                sb.append("l");
            }else{
                sb.append(arr[i]);
            }
        }
        
        return sb.toString();
    }
}