class Solution {
    public String solution(String my_string, int n) {
        
        String[] strAry = my_string.split("");
        StringBuilder sb = new StringBuilder();
        for(String str : strAry){
            sb.append(str.repeat(n));
        }
        
        return sb.toString();
    }
}