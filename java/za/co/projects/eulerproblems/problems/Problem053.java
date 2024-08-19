package za.co.projects.eulerproblems.problems;

import java.math.BigInteger;

public class Problem053 {
    public static BigInteger Factorial(BigInteger num) {
        BigInteger result = new BigInteger("1");
        while (num.compareTo(BigInteger.ONE) != 0) {
            result = result.multiply(num);
            num = num.subtract(BigInteger.ONE);
        }
        return result;
    }

    public static BigInteger nCr(BigInteger n, BigInteger r) {
        BigInteger nfact = Factorial(n);
        BigInteger rfact = Factorial(r);
        BigInteger nMinusrfact = n.subtract(r);
        if (nMinusrfact.compareTo(BigInteger.ONE) < 0)
            nMinusrfact = BigInteger.ONE;
        else
            nMinusrfact = Factorial(nMinusrfact);

        BigInteger result = nfact.divide((rfact.multiply(nMinusrfact)));
        return result;
    }

    public static void main(String[] args) {
        // System.out.println(Factorial(BigInteger.valueOf(6)));
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            for (int j = i; j > 0; j--) {
                BigInteger n = BigInteger.valueOf(i);
                BigInteger r = BigInteger.valueOf(j);
                BigInteger nCr = nCr(n, r);
                if (nCr.compareTo(BigInteger.valueOf(1000000)) > 0)
                    count++;
            }
        }
        System.out.println(count);
    }
}
