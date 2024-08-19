package za.co.projects.eulerproblems.problems;

public class Problem044 {
    public static Boolean isPentagonal(int Number) {
        double penTest = (Math.sqrt(1 + 24 * Number) + 1.0) / 6.0;
        return penTest == ((int) penTest);
    }

    public static void main(String[] args) {
        int result = 0;
        boolean notFound = true;
        int i = 1;

        while (notFound) {
            i++;
            int n = i * (3 * i - 1) / 2;

            for (int j = i - 1; j > 0; j--) {
                int m = j * (3 * j - 1) / 2;
                if (isPentagonal(n - m) && isPentagonal(n + m)) {
                    result = n - m;
                    notFound = false;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
