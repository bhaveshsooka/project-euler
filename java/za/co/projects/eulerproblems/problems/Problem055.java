package za.co.projects.eulerproblems.problems;

import java.math.BigInteger;

public class Problem055 {
    public static boolean isPalindrome(String a) {
        String b = ReverseString(a);
        return a.equals(b);
    }

    public static String ReverseString(String input) {
        String result = "";
        for (int i = input.toCharArray().length - 1; i >= 0; i--) {
            result += input.charAt(i);
        }
        return result;
    }

    public static boolean isLychrel(BigInteger input) {
        boolean flag = false;

        String original = input.toString();
        String reverse = ReverseString(original);

        BigInteger sum = new BigInteger(original);
        sum = sum.add(new BigInteger(reverse));

        int iteration = 1;
        while (iteration < 60) {
            if (isPalindrome(sum.toString())) {
                flag = true;
                break;
            }
            original = sum.toString();
            reverse = ReverseString(original);

            sum = new BigInteger(original);
            sum = sum.add(new BigInteger(reverse));
            iteration++;
        }
        //System.out.println(sum.toString());
        return flag;
    }

    public static void main(String[] args) {
        BigInteger test = new BigInteger("10677");
        isLychrel(test);
        int limit = 10000;
        int count = 0;
        for (int i = 10; i < limit; i++) {
            if (!isLychrel(BigInteger.valueOf(i)))
                count++;
        }
        System.out.println(count);
    }
}
