package za.co.projects.eulerproblems.problems;

import java.math.BigInteger;

public class Problem015 {
    public static BigInteger factorial(long n) {
        if ((n == 0) || (n == 1)) {
            return BigInteger.ONE;
        }
        BigInteger answer = BigInteger.ONE;
        for (int i = 1; i < n + 1; i++) {
            answer = answer.multiply(BigInteger.valueOf(i));
        }
        return answer;
    }

    public static void main(String args[]) {
        long n = 40;
        long k = 20;
        BigInteger top = factorial(n);
        BigInteger bottom = factorial(k).multiply(factorial(n - k));
        BigInteger result = top.divide(bottom);
        System.out.println(result);
    }
}
