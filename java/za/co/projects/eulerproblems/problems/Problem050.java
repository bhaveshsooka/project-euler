package za.co.projects.eulerproblems.problems;

import java.util.ArrayList;
import java.util.Arrays;

public class Problem050 {
    public static void main(String args[]) {
        // long[] test = ESieve(100);
        int limit = 1000000;
        long result = 0;
        int numberOfPrimes = 0;
        long[] primes = ESieve(limit);
        long[] primeSum = new long[primes.length + 1];

        primeSum[0] = 0;
        for (int i = 0; i < primes.length; i++) {
            primeSum[i + 1] = primeSum[i] + primes[i];
        }

        for (int i = numberOfPrimes; i < primeSum.length; i++) {
            for (int j = i - (numberOfPrimes + 1); j >= 0; j--) {
                if (primeSum[i] - primeSum[j] > limit)
                    break;

                if ((Search(primes, primeSum[i] - primeSum[j])) >= 0) {
                    numberOfPrimes = i - j;
                    result = primeSum[i] - primeSum[j];
                }
            }
        }

        System.out.println(result);
    }

    public static long[] Convert(ArrayList<Long> Arr) {
        long[] result = new long[Arr.size()];
        for (int i = 0; i < Arr.size(); i++) {
            result[i] = Arr.get(i);
        }
        return result;
    }

    public static long Search(long[] Array, long key) {
        long result = -1;
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] == key)
                result = i;
        }
        return result;
    }

    public static long[] ESieve(int upperLimit) {
        int sieveBound = (upperLimit - 1) / 2;
        int upperSqrt = (int) (Math.sqrt(upperLimit) - 1) / 2;

        boolean[] A = new boolean[sieveBound + 1];
        Arrays.fill(A, true);

        for (int i = 1; i <= upperSqrt; i++) {
            if (A[i]) {
                for (int j = i * 2 * (i + 1); j <= sieveBound; j += 2 * i + 1) {
                    A[j] = false;
                }
            }
        }

        ArrayList<Long> numbers = new ArrayList<Long>((int) (upperLimit / (Math.log(upperLimit) - 1.08366)));
        numbers.add((long) 2);
        for (int i = 1; i <= sieveBound; i++) {
            if (A[i])
                numbers.add((long) (2 * i + 1));
        }
        return Convert(numbers);
    }
}