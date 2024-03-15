class Solution {
    public int solution(int[] arr, int idx) {
        int answer = -1;       
        
        int min = 100001; 
        for(int i = idx; i < arr.length; i++){
            if(arr[i] == 1){
                return i;
            }                 
        }
        return answer;
    }
}