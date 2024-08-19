package za.co.projects.eulerproblems.problems;

public class Problem014 {
    public static int CollatzLength(long n) {
        int count = 1;
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = (3 * n) + 1;
            }
            count++;
        }
        return count;
    }

    public static void main(String args[]) {
        long max = 0;
        long answer = 0;
        for (int i = 1; i < 1000000; i++) {
            int n = CollatzLength(i);
            if (n >= max) {
                max = n;
                answer = i;
            }
        }
        System.out.println(answer);
    }
}
