class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        int idx = 1;
        while(true){
            if(slice*idx < n){
                idx++;
            }else{
                break;
            }
            
        }
        
        return idx;
    }
}