package za.co.projects.eulerproblems.problems;

public class Problem030 {
    public static boolean CanBeWrittenAsFifthDigitPower(long n) {
        String number = Long.toString(n);
        long MiniSum = 0;
        for (int i = 0; i < number.length(); i++) {
            String t = number.substring(i, i + 1);
            int val = Integer.valueOf(t);

            int ToAdd = val * val * val * val * val;
            MiniSum = MiniSum + ToAdd;
        }
        return (MiniSum == n);
    }

    public static void main(String args[]) {
        long sum = 0;
        for (int i = 2; i < 354294; i++) {
            if (CanBeWrittenAsFifthDigitPower(i)) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
