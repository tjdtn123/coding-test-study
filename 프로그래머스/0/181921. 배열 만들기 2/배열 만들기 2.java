import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        int[] arr = {-1};
        int count1 = 0;
        List<Integer> arrlist = new ArrayList<>(); 
        for(int i = l; i <= r; i++){
            String strNum = String.valueOf(i);
            int count2 = 0;
            for(int j = 0; j < strNum.length(); j++){
                if(strNum.charAt(j) == '0' || strNum.charAt(j) == '5'){
                    count2++;                    
                }
            }
            if(count2 == strNum.length()){
                arrlist.add(i);   
                count1++;
            }
        }
        
        int[] arrint = new int[arrlist.size()];
        for(int i = 0; i < arrint.length; i++){
            arrint[i] = arrlist.get(i);
        }
        
        
        if(count1 > 0){
            return arrint;
        }else{
            return arr;
        }
        
    }
}