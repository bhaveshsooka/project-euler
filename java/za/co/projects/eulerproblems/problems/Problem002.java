package za.co.projects.eulerproblems.problems;

public class Problem002 {
    public static void main(String args[]) {
        int i = 1;
        int j = 2;
        int n = i + j;
        int sum = 2;
        while (n < 4000000) {
            if (n % 2 == 0) {
                sum = sum + n;
            }
            i = j;
            j = n;
            n = i + j;
        }
        System.out.println(sum);
    }
}
