package za.co.projects.eulerproblems.problems;

public class Problem058 {
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

    public static void main(String[] args) {
        int a, b, c, d;
        int n = 2;
        int numPrimes = 0;
        int numNumbers = 0;
        double percent = Double.valueOf(numPrimes) / Double.valueOf(numNumbers);
        while (true) {
            a = (4 * n * n) - (10 * n) + 7;
            b = (4 * n * n) - (8 * n) + 5;
            c = (4 * n * n) - (6 * n) + 3;
            d = (4 * n * n) - (4 * n) + 1;

            numNumbers = 4 * (n - 1) + 1;
            if (isPrime(a))
                numPrimes++;
            if (isPrime(b))
                numPrimes++;
            if (isPrime(c))
                numPrimes++;
            if (isPrime(d))
                numPrimes++;

            percent = Double.valueOf(numPrimes) / Double.valueOf(numNumbers) * 100.0;
//			System.out.println("abcd: " + a + " " + b + " " + c + " " + d);
//			System.out.println("ratio: " + numPrimes + " " + numNumbers);
//			System.out.println("percent: " + percent);
//			System.out.println("");
            if (percent <= 10.0)// || n == 4)
                break;
            n++;
        }
        System.out.println(n * 2 - 1);
    }
}
