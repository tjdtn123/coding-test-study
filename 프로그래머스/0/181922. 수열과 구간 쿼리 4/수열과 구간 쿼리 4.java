class Solution {
    public int[] solution(int[] arr, int[][] queries) {
               
        for(int i = 0; i < queries.length; i++){
            
            int[] query = queries[i];
            int s = query[0];
            int e = query[1];
            int k = query[2];
            
            for(int j = s; j <= e; j++){
                arr[j] += j % k == 0 ? 1 : 0;
            }
        }
        return arr;
    }
}