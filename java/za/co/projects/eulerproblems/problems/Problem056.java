package za.co.projects.eulerproblems.problems;

import java.math.BigInteger;

public class Problem056 {
    public static void main(String[] args) {
        int max = 0;
        for (int a = 1; a < 100; a++) {
            for (int b = 1; b < 100; b++) {
                BigInteger power = BigInteger.valueOf(a).pow(b);
                int localmax = getDigitSum(power.toString());
                if (localmax > max)
                    max = localmax;
            }
        }
        System.out.println(max);
    }

    public static int getDigitSum(String Number) {
        int sum = 0;
        for (char digit : Number.toCharArray()) {
            int idigit = Integer.parseInt(String.valueOf(digit));
            sum += idigit;
        }
        return sum;
    }
}
