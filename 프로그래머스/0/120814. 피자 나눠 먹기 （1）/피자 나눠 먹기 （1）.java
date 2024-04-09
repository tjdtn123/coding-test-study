class Solution {
    public int solution(int n) {
        int answer = 0;
        int val = n / 7;
        int rest = n % 7;
        return rest > 0 ? val + 1 : val;
    }
}