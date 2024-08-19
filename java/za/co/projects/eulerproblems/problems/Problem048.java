package za.co.projects.eulerproblems.problems;

import java.math.BigInteger;

public class Problem048 {
    public static void main(String[] args) {
        BigInteger sum = BigInteger.ZERO;
        BigInteger i = new BigInteger("1000");
        while (i.compareTo(BigInteger.ZERO) != 0) {
            sum = sum.add(i.pow(Integer.parseInt(i.toString())));
            i = i.subtract(BigInteger.ONE);
        }
        String s = sum.toString();
        System.out.println(s.substring(s.length() - 10));
    }
}
