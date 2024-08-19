package za.co.projects.eulerproblems.problems;

public class Problem005 {
    public static void main(String args[]) {
        int count = 0;
        int n = 19;
        while (count != 10) {
            n++;
            count = 0;
            for (int i = 11; i < 21; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
        }
        System.out.println(n);
    }
}
