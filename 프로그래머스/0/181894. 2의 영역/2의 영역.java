 class Solution {
    public int[] solution(int[] arr) {
        int first = 0;
        int last = 0;
        int cnt = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2){
                first = i;
                cnt++;
                break;
            }
        }
        for(int i = arr.length - 1; i >= 0; i --){
            if(arr[i] == 2){
                last = i;
                break;
            }
        }
        System.out.println(first);
        System.out.println(last);
        int[] result = new int[last - first + 1];
        if(first == last){
            if(cnt >= 1){
                result[0] = 2;
            }else{
                result[0] = -1;
            }
        }else{
            int idx = 0;
            for(int i = first; i < last+1; i++){
                result[idx] = arr[i];
                idx++;
            }
        }
        
        
        return result;
    }
}