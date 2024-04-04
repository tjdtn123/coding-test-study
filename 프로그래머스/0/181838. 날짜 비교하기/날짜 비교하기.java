import java.util.*;
class Solution {
    public int solution(int[] date1, int[] date2) {
        int year1 = date1[0];
        int year2 = date2[0];
        int month1 = date1[1];
        int month2 = date2[1];
        int day1 = date1[2];
        int day2 = date2[2];
        
        Date da1 = new Date(year1,month1,day1);
        Date da2 = new Date(year2,month2,day2);
        
        return da1.before(da2)? 1 : 0;
    }
}