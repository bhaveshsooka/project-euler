package za.co.projects.eulerproblems.problems;

public class Problem031 {
    static int[] Coinset = {200, 100, 50, 20, 10, 5, 2, 1};

    public static void main(String[] args) {
        System.out.println(Count(Coinset.length, 200));

    }

    public static int Count(int m, int n) {
        if (n == 0)
            return 1;
        if (n < 0)
            return 0;
        if ((m <= 0) && (n >= 1))
            return 0;
        return Count(m - 1, n) + Count(m, n - Coinset[m - 1]);
    }
}
