package za.co.projects.eulerproblems.problems;

import java.util.ArrayList;

public class Problem062 {
    public static void main(String args[]) {
        long num = 345;
        ArrayList<String> Cubes = new ArrayList<String>();
        while (true) {
            num++;
            long smallest = getSmallestCube(num);

            String small = String.valueOf(smallest);
            small = Sort(small);
            if (!Cubes.contains(small)) {
                Cubes.add(small);
            }

        }
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

    public static long getSmallestCube(long number) {
        long k = number;
        int[] digits = new int[10];
        long retVal = 0;

        while (k > 0) {
            digits[(int) (k % 10)]++;
            k /= 10;
        }

        for (int i = 9; i >= 0; i--) {
            for (int j = 0; j < digits[i]; j++) {
                retVal = retVal * 10 + i;
            }
        }
        return retVal;
    }
}
