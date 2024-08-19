package za.co.projects.eulerproblems.problems;

import java.math.BigInteger;


public class Problem016 {
    public static void main(String args[]) {
        BigInteger base = BigInteger.valueOf(2);
        int exp = 1000;
        BigInteger n = base.pow(exp);
        String s = n.toString();
        long sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int index = Integer.parseInt(s.substring(i, i + 1));
            sum = sum + index;
        }
        System.out.println(sum);
    }
}
