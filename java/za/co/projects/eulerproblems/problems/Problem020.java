package za.co.projects.eulerproblems.problems;

import java.math.BigInteger;

public class Problem020 {
    public static BigInteger factorial(long n) {
        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i < n + 1; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }

    public static void main(String args[]) {
        BigInteger n = factorial(100);
        String s = n.toString();

        long sum = 0;
        for (int i = 0; i < s.length(); i++) {
            String t = s.substring(i, i + 1);
            int k = Integer.parseInt(t);
            sum = sum + k;
        }
        System.out.println(sum);
    }
}
