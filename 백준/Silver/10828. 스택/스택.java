import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;

public class Main {
    public static class Stack {
        List<Integer> list = new LinkedList<>();

        public void push(int num) {
            this.list.add(num);
        }

        public void pop() {
            if (this.list.size() == 0) {
                System.out.println(-1);
            } else {
                int last = this.list.get(this.list.size() - 1);
                this.list.remove(this.list.size() - 1);
                System.out.println(last);
            }
        }

        public void top() {
            if (this.list.size() == 0) {
                System.out.println(-1);
            } else {
                System.out.println(this.list.get(this.list.size() - 1));
            }
        }

        public void size() {
            System.out.println(this.list.size());
        }

        public void empty() {
            System.out.println(this.list.isEmpty() ? 1 : 0);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();  // 개행 문자 처리

        Stack stack = new Stack(); // 스택 객체를 main에서 한 번만 생성

        for (int i = 0; i < num; i++) {
            solution(sc.nextLine(), stack);
        }
        sc.close();
    }

    public static void solution(String order, Stack stack) {
        if (order.startsWith("push")) { // "push"로 시작하는지 확인
            String[] pushAry = order.split(" ");
            if (pushAry.length > 1) { // 안전하게 숫자가 있는지 확인
                stack.push(Integer.parseInt(pushAry[1]));
            }
        } else if (order.equals("top")) {
            stack.top();
        } else if (order.equals("size")) {
            stack.size();
        } else if (order.equals("empty")) {
            stack.empty();
        } else if (order.equals("pop")) {
            stack.pop();
        }
    }
}