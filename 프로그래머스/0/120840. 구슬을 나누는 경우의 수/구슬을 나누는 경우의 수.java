import java.math.*;

class Solution {
    public int solution(int balls, int share) {
        if (balls == share) {
            return 1;
        }
        BigInteger numerator = factorial(balls);
        BigInteger denominator = factorial(balls - share).multiply(factorial(share));
        return numerator.divide(denominator).intValue();
    }

    public BigInteger factorial(int num) {
        BigInteger total = BigInteger.ONE;
        for (int i = 1; i <= num; i++) {
            total = total.multiply(BigInteger.valueOf(i));
        }
        return total;
    }
}