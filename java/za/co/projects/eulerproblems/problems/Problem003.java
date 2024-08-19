package za.co.projects.eulerproblems.problems;

public class Problem003 {
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
        long s = System.nanoTime();
        long m = 600851475143l;
        long max = 0;
        for (int i = 1; i < Math.sqrt(m); i += 2) {
            if (m % i == 0) {
                if ((isPrime(i)) && (i > max)) {
                    max = i;
                }
            }
        }
        System.out.println(max);
        long e = System.nanoTime();
        System.out.println("Time Taken: " + (e - s));
    }
}
