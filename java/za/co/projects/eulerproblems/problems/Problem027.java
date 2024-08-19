package za.co.projects.eulerproblems.problems;

public class Problem027 {
    public static boolean isPrime(long n) {
        if (n <= 1)
            return false;
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;

        for (int i = 2; i < Math.sqrt(n) + 1; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static int findMaxN(int a, int b) {

        int max = 0;
        int n = 2;

        while (isPrime(n * n + a * n + b)) {
            if (n > max)
                max = n++;
        }

        return max;
    }

    public static void main(String[] args) {
        int MaxN = 0;
        int MaxA = 0;
        int MaxB = 0;

        int tmpMax = 0;
        for (int a = -999; a <= 999; a += 2) {
            for (int b = 3; b <= 999; b += 2) {
                tmpMax = findMaxN(a, b);
                if (tmpMax > MaxN) {
                    MaxN = tmpMax;
                    MaxA = a;
                    MaxB = b;
                }
            }
        }
        System.out.println(MaxA * MaxB);
    }
}
