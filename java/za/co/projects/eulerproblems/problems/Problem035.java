package za.co.projects.eulerproblems.problems;

public class Problem035 {
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

    public static boolean isCircular(long n) {
        if (!isPrime(n)) {
            return false;
        }
        boolean flag = true;
        String t = Long.toString(n);
        for (int i = 0; i < t.length(); i++) {
            String a = t.substring(i + 1, t.length());
            String b = t.substring(0, i + 1);
            String c = a + b;
            long value = Long.valueOf(c);
            if (!isPrime(value)) {
                flag = false;
            }
        }
        return flag;
    }

    public static void main(String args[]) {
        long count = 1;
        for (int i = 3; i < 1000000; i += 2) {
            if (isCircular(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
