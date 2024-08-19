package za.co.projects.eulerproblems.problems;

import java.math.BigInteger;

public class Problem057 {
    public static void main(String[] args) {
        int limit = 1000;
        int result = 0;

        BigInteger num = new BigInteger("3");
        BigInteger den = new BigInteger("2");

        for (int i = 1; i < limit; i++) {
            num = num.add(BigInteger.valueOf(2).multiply(den));
            den = num.subtract(den);
            if (num.toString().length() > den.toString().length())
                result++;
        }
        System.out.println(result);
    }

}
