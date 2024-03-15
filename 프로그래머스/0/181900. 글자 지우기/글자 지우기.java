import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        
        String[] a = my_string.split("");
        StringBuilder b = new StringBuilder();
        
        for(int i = 0; i < indices.length; i++){
            a[indices[i]] = "";
        }
        for(int i = 0; i < a.length; i++){
            b.append(a[i]);
        }
        
        return b.toString();
    }
}