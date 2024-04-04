import java.util.*;
class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = {};
        List<String> list = new ArrayList<>();
        for(int i = 0; i < picture.length; i++){
            String box = "";
            String[] pixel = picture[i].split("");
            for(int j = 0; j < pixel.length; j++){
                for(int p = 0; p < k; p++){
                    box += pixel[j];
                }
            }
            for(int p = 0; p < k; p++){
                list.add(box);
            }
            
        }
        
        return list.stream().map(i -> i).toArray(String[] :: new);
    }
}