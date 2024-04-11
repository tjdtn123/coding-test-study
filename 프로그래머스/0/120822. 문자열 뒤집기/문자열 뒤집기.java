class Solution {
    public String solution(String my_string) {
        
        String[] strAry = my_string.split("");
        StringBuilder sb = new StringBuilder();
        
        for(int i = strAry.length-1; i >= 0; i--){
            sb.append(strAry[i]);
        }
        
        return sb.toString();
    }
}