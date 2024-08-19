package za.co.projects.eulerproblems.problems;

import java.util.ArrayList;

public class Problem047 {
    public static Boolean TestNext3(long Num) {
        if (getPrimes(Num + 1) != 4)
            return false;
        if (getPrimes(Num + 2) != 4)
            return false;
        if (getPrimes(Num + 3) != 4)
            return false;
        return true;
    }

    public static int getPrimes(long Num) {
        ArrayList<Long> PrimeFactors = new ArrayList<Long>();
        long copyOfInput = Num;

        for (long i = 2; i <= copyOfInput; i++) {
            if (copyOfInput % i == 0) {
                if (!PrimeFactors.contains(i)) {
                    PrimeFactors.add(i); // prime factor
                }
                copyOfInput /= i;
                i--;
            }
        }
        return PrimeFactors.size();
    }

    public static void main(String[] args) {
        int Num = 646;
        int result = 0;
        while (true) {
            if (getPrimes(Num) == 4) {
                if (TestNext3(Num) == true) {
                    result = Num;
                    break;
                }
            }
            //System.out.println("Failed on : " + Num);
            Num = Num + 1;
        }
        System.out.println(result);
    }
}
