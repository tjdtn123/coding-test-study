class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = {};
        int size = num_list.length / n;
        answer = new int[size][n];
        int ansidx = 0;
        int idx = 0;
        while(ansidx < size){
            for(int i = 0; i < n; i++){
                answer[ansidx][i] = num_list[idx++];
            }
            ansidx++;
        }        
        return answer;
    }
}