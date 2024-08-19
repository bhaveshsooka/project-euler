package za.co.projects.eulerproblems.problems;

import java.math.BigInteger;


public class Problem025 {
    public static void main(String args[]) {
        BigInteger a = BigInteger.ONE;
        ;
        BigInteger b = BigInteger.ONE;
        BigInteger fib = a.add(b);
        String s = fib.toString();
        long count = 3;
        while (s.length() < 1000) {
            a = b;
            b = fib;
            fib = a.add(b);
            s = fib.toString();
            count++;
            //System.out.println(fib);
        }
        System.out.println(count);
    }
}
