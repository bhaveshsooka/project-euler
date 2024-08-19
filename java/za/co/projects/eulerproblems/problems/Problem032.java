package za.co.projects.eulerproblems.problems;

import java.util.ArrayList;

public class Problem032 {
    public static void main(String[] args) {
        ArrayList<Long> CheckedProducts = new ArrayList<Long>();
        long sum = 0;
        for (int i = 2; i < 100; i++) {
            long low = (i > 9) ? 123 : 1234;
            long high = 10000 / i + 1;
            for (long j = low; j < high; j++) {
                long product = i * j;
                String CheckPandigital = String.valueOf(i) + String.valueOf(j)
                  + String.valueOf(product);

                if (CheckPandigital.length() != 9) {
                    continue;
                }
                if (isPandigital(CheckPandigital) == true) {
                    if (!CheckedProducts.contains(product)) {
                        CheckedProducts.add(product);
                    }
                }
            }
        }
        for (int j = 0; j < CheckedProducts.size(); j++) {
            //System.out.println(CheckedProducts.get(j));
            sum += CheckedProducts.get(j);
        }
        System.out.println(sum);

    }

    public static String SortString(String Number) {
        char[] arr = Number.toCharArray();
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

    public static Boolean isPandigital(String Number) {
        String Sorted = SortString(Number);
        return Sorted.equals("123456789");
    }
}
