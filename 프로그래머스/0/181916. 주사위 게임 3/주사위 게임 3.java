import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] numbers = new int[7];
        numbers[a] += 1;
        numbers[b] += 1;
        numbers[c] += 1;
        numbers[d] += 1;

        int answer = 0, p = 0, q = 0, r = 0;
        int max = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        
        switch(max){
            case 4 : answer = 1111*a;
                break;
            case 3 : 
                for(int i = 0; i < numbers.length; i++){
                    if(numbers[i] == 3){
                        p = i;
                    }else if(numbers[i] == 1){
                        q = i;
                    }
                }
                answer = (int)(Math.pow((10 * p + q),2));
                break;
            case 2 : 
                boolean contains = Arrays.stream(numbers).anyMatch(num -> num == 1);
                if(contains) {
                    for(int i = 0; i < numbers.length; i++){                        
                        if(numbers[i] == 1){
                            if(q == 0){
                                q = i;
                            }else{
                                r = i;
                            }                            
                        }
                    }
                    answer = q*r;
                }else{
                    for(int i = 0; i < numbers.length; i ++){
                        if(numbers[i] == 2){
                            if(p == 0){
                                p = i;
                            }else{
                                q = i;
                            }
                        }
                    }
                    answer = (p+q) * (Math.abs(p-q));
                }
                break;
            case 1: 
                for(int i = 0; i < numbers.length; i++){
                    if(numbers[i] == 1){
                        answer = i;
                        break;
                    }
                }
                break;
            default : break;
        }
        
        return answer;
    }
}