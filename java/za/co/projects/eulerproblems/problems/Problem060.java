package za.co.projects.eulerproblems.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Problem060 {
    static long[] primes = ESieve(30000);

    public static void main(String[] args) {
        HashSet<?>[] pairs = new HashSet<?>[primes.length];
        long result = Long.MAX_VALUE;

        for (int a = 1; a < primes.length; a++) {
            if (primes[a] * 5 >= result)
                break;
            if (pairs[a] == null)
                pairs[a] = MakePairs(a);
            for (int b = a + 1; b < primes.length; b++) {
                if (primes[a] + primes[b] * 4 >= result)
                    break;
                if (!pairs[a].contains(primes[b]))
                    continue;
                if (pairs[b] == null)
                    pairs[b] = MakePairs(b);

                for (int c = b + 1; c < primes.length; c++) {
                    if (primes[a] + primes[b] + primes[c] * 3 >= result)
                        break;
                    if (!pairs[a].contains(primes[c]) || !pairs[b].contains(primes[c]))
                        continue;
                    if (pairs[c] == null)
                        pairs[c] = MakePairs(c);

                    for (int d = c + 1; d < primes.length; d++) {
                        if (primes[a] + primes[b] + primes[c] + primes[d] * 2 >= result)
                            break;
                        if (!pairs[a].contains(primes[d]) || !pairs[b].contains(primes[d]) || !pairs[c].contains(primes[d]))
                            continue;
                        if (pairs[d] == null)
                            pairs[d] = MakePairs(d);

                        for (int e = d + 1; e < primes.length; e++) {
                            if (primes[a] + primes[b] + primes[c] + primes[d] + primes[e] >= result)
                                break;
                            if (!pairs[a].contains(primes[e]) || !pairs[b].contains(primes[e]) || !pairs[c].contains(primes[e]) || !pairs[d].contains(primes[e]))
                                continue;

                            if (result > primes[a] + primes[b] + primes[c] + primes[d] + primes[e])
                                result = primes[a] + primes[b] + primes[c] + primes[d] + primes[e];

                            // Console.WriteLine("{0} + {1} + {2} + {3} + {4} = {5}",
                            // primes[a], primes[b], primes[c], primes[d],
                            // primes[e], result);
                            break;
                        }
                    }
                }
            }
        }
        System.out.println(result);
    }

    public static HashSet<Long> MakePairs(int a) {
        HashSet<Long> pairs = new HashSet<Long>();
        for (int b = a + 1; b < primes.length; b++) {
            if (isPrime(concat(primes[a], primes[b])) && isPrime(concat(primes[b], primes[a])))
                pairs.add(primes[b]);
        }
        return pairs;
    }

    public static long concat(long a, long b) {
        long c = b;
        while (c > 0) {
            a *= 10;
            c /= 10;
        }

        return a + b;
    }

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

    public static long[] Convert(ArrayList<Long> Arr) {
        long[] result = new long[Arr.size()];
        for (int i = 0; i < Arr.size(); i++) {
            result[i] = Arr.get(i);
        }
        return result;
    }

}
