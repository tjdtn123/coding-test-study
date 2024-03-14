class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        String [][] a = new String[my_string.length()/m][m];
        String[] b = my_string.split("");
        int cnt = 0;
        for(int i = 0; i < my_string.length()/m; i++){
            for(int j = 0; j < m; j++){
                a[i][j] = b[cnt];
                cnt++;
            } 
        }
        
        for(int i = 0; i < a.length; i++){
            answer +=a[i][c-1];
        }
        return answer;
    }
}