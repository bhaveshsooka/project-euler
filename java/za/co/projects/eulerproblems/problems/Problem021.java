package za.co.projects.eulerproblems.problems;

public class Problem021 {
    public static long SumOfDivisors(long n) {
        long sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    public static void main(String args[]) {
        long sum = 0;
        for (int i = 1; i < 10000; i++) {
            long a = SumOfDivisors(i);
            long b = SumOfDivisors(a);
            if ((a != b) && (b == i)) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
