package za.co.projects.eulerproblems.problems;

public class Problem007 {
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
        int count = 1;
        int i = -1;
        while (count != 10001) {
            i = i + 2;
            if (isPrime(i)) {
                count++;
            }

        }
        System.out.println(i);
    }
}
