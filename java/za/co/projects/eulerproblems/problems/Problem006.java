package za.co.projects.eulerproblems.problems;

public class Problem006 {
    public static void main(String args[]) {
        //calculate sum of squares
        long sum1 = 0;
        for (int i = 0; i < 101; i++) {
            long t = i * i;
            sum1 = sum1 + t;
        }

        //calculate square of sum
        long sum2 = 0;
        for (int i = 0; i < 101; i++) {
            sum2 = sum2 + i;
        }
        sum2 = sum2 * sum2;

        //calculate difference
        long d = Math.abs(sum1 - sum2);
        System.out.println(d);
    }
}
