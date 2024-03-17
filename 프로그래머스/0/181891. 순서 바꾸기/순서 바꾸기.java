import java.util.*;
class Solution {
    public List<Integer> solution(int[] num_list, int n) {        
        List<Integer> list = new ArrayList<>();
        int[] a = Arrays.copyOfRange(num_list,0,n);
        int[] b = Arrays.copyOfRange(num_list,n,num_list.length);
        
        for(int belem : b){
            list.add(belem);            
        }
        for(int aelem : a){
            list.add(aelem);            
        }   
        
        return list;
    }
}