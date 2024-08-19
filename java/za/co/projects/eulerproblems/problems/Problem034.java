package za.co.projects.eulerproblems.problems;


public class Problem034 {
    public static long Factorial(long n) {
        long product = 1;
        for (long i = n; i > 1; i--) {
            product = product * i;
        }
        return product;
    }

    public static long FactLength(long number) {
        long result = 0;
        for (long i = 1; i < number + 1; i++) {
            result = result + Factorial(9);
        }
        return result;
    }

    public static boolean isSumOFFactorialDigits(long n) {
        String number = Long.toString(n);
        long SumOfFactorialOfDigits = 0;
        for (int i = 0; i < number.length(); i++) {
            long val = Long.valueOf(number.substring(i, i + 1));
            SumOfFactorialOfDigits = SumOfFactorialOfDigits + Factorial(val);
        }
        return (n == SumOfFactorialOfDigits);
    }

    public static void main(String args[]) {
        long NoOfDigits = 1;
        long UpperLimit = FactLength(NoOfDigits);
        int length = Long.toString(UpperLimit).length();
        while (NoOfDigits <= length) {
            NoOfDigits++;
            UpperLimit = FactLength(NoOfDigits);
        }
        long sum = 0;
        for (int i = 3; i < UpperLimit + 1; i++) {
            if (isSumOFFactorialDigits(i)) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
