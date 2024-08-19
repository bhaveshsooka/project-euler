package za.co.projects.eulerproblems.problems;

public class Problem028 {
    public static void main(String args[]) {
        int sum = 0;
        int a = (4 * 1 * 1) - (10 * 1) + 7;
        int b = (4 * 1 * 1) - (8 * 1) + 5;
        int c = (4 * 1 * 1) - (6 * 1) + 3;
        int d = (4 * 1 * 1) - (4 * 1) + 1;
        int n = 1;
        while (d != 1001 * 1001) {
            a = (4 * n * n) - (10 * n) + 7;
            b = (4 * n * n) - (8 * n) + 5;
            c = (4 * n * n) - (6 * n) + 3;
            d = (4 * n * n) - (4 * n) + 1;
            n++;
            sum = sum + a + b + c + d;
        }
        sum = sum - 3;
        System.out.println(sum);
    }
}
