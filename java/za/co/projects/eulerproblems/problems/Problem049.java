package za.co.projects.eulerproblems.problems;

import java.util.ArrayList;

public class Problem049 {
    public static void main(String[] args) {
        ArrayList<String> Result = new ArrayList<String>();
        ArrayList<Integer> Numbers = new ArrayList<Integer>();
        for (int i = 1000; i < 10000; i++) {
            if (isPrime(i))
                Numbers.add(i);
        }

        for (Integer i : Numbers) {
            for (Integer j : Numbers) {
                if (i >= j)
                    continue;
                Integer k = j + (j - i);
                if ((k >= 10000) || (!isPrime(k)))
                    continue;

                if (CheckPerm(i.toString(), j.toString()) == false)
                    continue;
                if (CheckPerm(i.toString(), k.toString()) == false)
                    continue;
                Result.add(i.toString() + j.toString() + k.toString());
            }
        }
        for (String string : Result) {
            System.out.println(string);
        }
    }

    public static boolean isPrime(long n) {
        if (n % 2 == 0)
            return false;
        if (n <= 1)
            return false;
        if (n == 2)
            return true;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static String Sort(String input) {
        char[] arr = input.toCharArray();
        String result = "";
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    char tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            result += arr[i];
        }
        return result;
    }

    public static boolean CheckPerm(String a, String b) {
        a = Sort(a);
        b = Sort(b);
        return a.equals(b);
    }
}
