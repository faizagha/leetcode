import java.math.BigInteger;

class Solution {
    public int numTrees(int n) {
        // Calculate the nth Catalan number directly
        return factorial(2 * n).divide(factorial(n + 1).multiply(factorial(n))).intValue();
    }

    // Helper method to calculate the factorial of a number
    private BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}

