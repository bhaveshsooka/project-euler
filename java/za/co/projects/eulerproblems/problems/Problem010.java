package za.co.projects.eulerproblems.problems;

public class Problem010 {
    public static boolean isPrime(long n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        int count = 0;
        for (int i = 2; i < Math.sqrt(n) + 1; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count > 0) {
            return false;
        }
        return true;
    }

    public static void main(String args[]) {
        System.out.println(isPrime(123));
        long sum = 2;
        for (int i = 1; i < 2000000; i += 2) {
            if (isPrime(i)) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
