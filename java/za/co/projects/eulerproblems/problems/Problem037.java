package za.co.projects.eulerproblems.problems;

public class Problem037 {
    public static boolean isPrime(long n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        int count = 0;
        for (int i = 2; i < Math.sqrt(n) + 1; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count > 0) {
            return false;
        }
        return true;
    }

    public static boolean isTruncatablePrime(long n) {
        String number = Long.toString(n);

        //delete from left
        boolean flag = true;
        for (int i = 0; i < number.length(); i++) {
            String t = number.substring(i, number.length());
            long val = Long.valueOf(t);
            String u = number.substring(0, number.length() - i);
            long val2 = Long.valueOf(u);
            if ((!isPrime(val)) || (!isPrime(val2))) {
                flag = false;
            }
        }
        return flag;
    }

    public static void main(String args[]) {
        int count = 0;
        long index = 9;
        long sum = 0;
        while (count != 11) {
            index = index + 2;
            if (isTruncatablePrime(index)) {
                count++;
                sum = sum + index;
            }
        }
        System.out.println(sum);
    }
}
