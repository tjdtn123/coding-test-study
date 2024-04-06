class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int x = 0;
        int y = 0;
        int sx = 0;
        int sy = 0;
        int ex = n-1;
        int ey = n-1;
        int idx = 1;
        
        while(idx <= n*n){
            for(int i = sx; i <= ex; i++){//04
                answer[y][x] = idx; // 00 01 02 03 11 12
                idx++;
                if(x < ex){
                    x++;      
                }
            }
            y++;                    // 13 22
            sy++;
            for(int i = sy; i <= ey; i++){//04
                answer[y][x] = idx; // 13 23 33 22
                idx++;
                if(y < ey){
                    y++;    
                }                
            }
            x--;                    // 32 21
            ex--;
            for(int i = ex; i >= sx; i--){//30
                answer[y][x] = idx; // 32 31 30 21
                idx++;  
                if(x > sx){
                    x--;
                }                
            }
            y--;                    // 20
            ey--;
            for(int i = ey; i >= sy; i--){//41
                answer[y][x] = idx; // 20 10
                idx++;
                if(y > sy){
                    y--;
                }                
            }
            x++;                    // 11
            sx++;
 
        }return answer;
    }
}