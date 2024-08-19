package za.co.projects.eulerproblems.problems;

import java.util.ArrayList;

public class Problem051 {

    public static ArrayList<String> hasRepeatingChars(int Input) {
        ArrayList<String> RepChars = new ArrayList<String>();
        String Number = String.valueOf(Input);
        char[] charArr = Number.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            for (int j = 0; j < charArr.length; j++) {
                if (i == j)
                    continue;
                if (charArr[i] == charArr[j]) {
                    if (!RepChars.contains(String.valueOf(charArr[i])))
                        RepChars.add(String.valueOf(charArr[i]));
                }
            }
        }
        return RepChars;
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

    public static ArrayList<String> permute(String Number) {
        ArrayList<String> Numbers = new ArrayList<String>();
        if (Number == null)
            return null;
        else if (Number.length() == 0) {
            Numbers.add("");
            return Numbers;
        }
        char FirstChar = Number.charAt(0);
        String Remainder = Number.substring(1);
        ArrayList<String> words = permute(Remainder);
        for (String word : words) {
            for (int i = 0; i <= word.length(); i++) {
                String f = word.substring(0, i);
                String l = word.substring(i);
                String ToAdd = f + FirstChar + l;
                Numbers.add(ToAdd);
            }
        }
        return Numbers;
    }

    public static int getPrimeCount(int Input, String perm) {
        int count = 0;
        String Number = String.valueOf(Input);

        for (int i = 0; i < 10; i++) {
            String tmp = Number.replaceAll(perm, String.valueOf(i));
            int itmp = Integer.parseInt(tmp);
            if (!String.valueOf(itmp).equals(tmp))
                continue;
            if (isPrime(itmp))
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
//		System.out.println(isPrime(111857));
//		int num = 111857;// 121313;
//		ArrayList<String> r = hasRepeatingChars(num);
//		int testcount = 0;
//		for (String perm : r)
//		{
//			testcount = getPrimeCount(num, perm);
//			System.out.println(testcount);
//		}

        int count = 0;
        int test_num = 1;
        while (true) {
            boolean found = false;
            ArrayList<String> RepeatingChars = hasRepeatingChars(test_num);
            if (RepeatingChars.size() > 0) {
                if (isPrime(test_num)) {
                    for (String repchar : RepeatingChars) {
                        count = getPrimeCount(test_num, repchar);
                        //System.out.println("Number: " + test_num + " with count: " + count);
                        if (count == 8)
                            found = true;
                    }

                }
            }
            if (found)
                break;
            test_num++;
        }
        System.out.println(test_num);

    }
}
