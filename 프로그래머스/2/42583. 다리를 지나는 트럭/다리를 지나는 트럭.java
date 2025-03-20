import java.util.Queue;
import java.util.LinkedList;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
       int time = 0; // 경과 시간
        int nowW = 0; // 현재 다리 위의 총 무게
        int index = 0; // 현재 트럭의 인덱스
        Queue<Integer> trucks = new LinkedList<>(); // 다리 위의 트럭을 나타내는 큐
        
        while (index < truck_weights.length) {
            time++;
            
            // 다리에서 트럭이 나가면 무게를 줄입니다.
            if (trucks.size() == bridge_length) {
                nowW -= trucks.poll(); // 다리를 지난 트럭의 무게를 빼줍니다.
            }
            
            // 다음 트럭을 다리에 올릴 수 있는지 확인합니다.
            if (nowW + truck_weights[index] <= weight) {
                trucks.offer(truck_weights[index]); // 트럭을 다리에 올립니다.
                nowW += truck_weights[index]; // 총 무게를 업데이트합니다.
                index++; // 다음 트럭으로 이동
            } else {
                // 트럭을 올릴 수 없다면, 빈 공간을 만들어야 하므로 0을 추가합니다.
                trucks.offer(0); // 대기 시간 동안 빈 공간을 채웁니다.
            }
        }

        return time + bridge_length;
        
    }
}