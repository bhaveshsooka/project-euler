package za.co.projects.eulerproblems.problems;

import java.util.ArrayList;

public class Problem024 {
    public static long factorial(long n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        long fact = 1;
        for (int i = 1; i < n + 1; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String args[]) {
        int[] perm = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int N = perm.length;
        String permNum = "";
        int remain = 1000000 - 1;

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            numbers.add(i);
        }

        for (int i = 1; i < N; i++) {
            int j = (int) (remain / factorial(N - i));
            remain = (int) (remain % factorial(N - i));
            permNum = permNum + numbers.get(j);
            numbers.remove(j);
            if (remain == 0) {
                break;
            }
        }

        for (int i = 0; i < numbers.size(); i++) {
            permNum = permNum + numbers.get(i);
        }
        System.out.println(permNum);
    }
}
