class Solution {
    public String solution(String code) {
        String ret = "";
        int idx = 0;
        int mode = 0;
        
        while(idx < code.length()){
            if(mode == 0) {
                if(code.charAt(idx) == '1') {
                    mode++;                    
                } else {
                    ret += idx % 2 == 0 ? code.charAt(idx) : "";
                }
            } else {
                if(code.charAt(idx) == '1') {
                   mode--;                
                } else {
                    ret += idx % 2 == 1 ? code.charAt(idx) : "";
                }
            }
            idx++;
        }        
        
        if(ret.isEmpty()){
            return "EMPTY";
        }else {
            return ret;
        }
        
       
    }
}