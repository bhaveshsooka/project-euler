package za.co.projects.eulerproblems.problems;

public class Problem012 {
    public static int NumberOfDivisors(int n) {
        int count = 0;
        for (int i = 1; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                count += 2;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        int i = 1;
        int j = 1;
        while (NumberOfDivisors(j) < 500) {
            i++;
            j = j + i;
        }
        System.out.println(j);
    }
}
