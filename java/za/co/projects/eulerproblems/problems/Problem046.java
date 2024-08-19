package za.co.projects.eulerproblems.problems;

import java.util.ArrayList;

public class Problem046 {
    public static boolean isPrime(long n) {
        if (n <= 1)
            return false;
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;

        for (int i = 2; i < Math.sqrt(n) + 1; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static ArrayList<Long> getPrimes(long Num) {
        ArrayList<Long> result = new ArrayList<Long>();
        while (Num > 1) {
            Num = Num - 1;
            if (isPrime(Num))
                result.add(Num);
        }
        return result;
    }

    public static void main(String[] args) {
        long num = 35;
        while (true) {
            if (isPrime(num) == true) {
                num += 2;
                continue;
            }
            //System.out.println(num);
            ArrayList<Long> Primes = getPrimes(num);
            int count = 0;
            //System.out.println(Primes.size());
            for (int i = 0; i < Primes.size(); i++) {
                //System.out.println("Testing Prime Number: " + (i + 1) + " Value : " + Primes.get(i));
                long tmp = num - Primes.get(i);
                // if (tmp % 2 != 0)
                // count++;
                tmp = tmp / 2;
                if (Math.sqrt(tmp) != (int) Math.sqrt(tmp))
                    count++;
            }
            if (count == Primes.size()) {
                break;
            }
            num += 2;
            // break;
        }
        System.out.println(num);
    }
}
