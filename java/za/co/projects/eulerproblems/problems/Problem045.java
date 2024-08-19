package za.co.projects.eulerproblems.problems;

public class Problem045 {
    public static Boolean isPentagonal(long Number) {
        double penTest = (Math.sqrt(1 + 24 * Number) + 1.0) / 6.0;
        return penTest == ((int) penTest);
    }

    public static void main(String[] args) {
        long i = 143;
        long num = 0;
        while (true) {
            i++;
            num = i * ((2 * i) - 1);
            if (isPentagonal(num)) {
                break;
            }
        }
        System.out.println(num);
    }
}
