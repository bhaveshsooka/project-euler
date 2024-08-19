package za.co.projects.eulerproblems.problems;

import java.math.BigInteger;
import java.util.ArrayList;

public class Problem043 {
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

    public static Boolean isSubStringDivisible(String Number) {
        if (Number.length() != 10)
            return false;
        int d234 = Integer.parseInt(String.valueOf(Number.charAt(1)) + String.valueOf(Number.charAt(2)) + String.valueOf(Number.charAt(3)));
        int d345 = Integer.parseInt(String.valueOf(Number.charAt(2)) + String.valueOf(Number.charAt(3)) + String.valueOf(Number.charAt(4)));
        int d456 = Integer.parseInt(String.valueOf(Number.charAt(3)) + String.valueOf(Number.charAt(4)) + String.valueOf(Number.charAt(5)));
        int d567 = Integer.parseInt(String.valueOf(Number.charAt(4)) + String.valueOf(Number.charAt(5)) + String.valueOf(Number.charAt(6)));
        int d678 = Integer.parseInt(String.valueOf(Number.charAt(5)) + String.valueOf(Number.charAt(6)) + String.valueOf(Number.charAt(7)));
        int d789 = Integer.parseInt(String.valueOf(Number.charAt(6)) + String.valueOf(Number.charAt(7)) + String.valueOf(Number.charAt(8)));
        int d8910 = Integer.parseInt(String.valueOf(Number.charAt(7)) + String.valueOf(Number.charAt(8)) + String.valueOf(Number.charAt(9)));

        if (d234 % 2 != 0)
            return false;
        if (d345 % 3 != 0)
            return false;
        if (d456 % 5 != 0)
            return false;
        if (d567 % 7 != 0)
            return false;
        if (d678 % 11 != 0)
            return false;
        if (d789 % 13 != 0)
            return false;
        if (d8910 % 17 != 0)
            return false;

        return true;
    }

    public static void main(String args[]) {
        BigInteger sum = BigInteger.ZERO;
        String PanDigitalArray = "";
        for (int i = 0; i < 10; i++) {
            PanDigitalArray += String.valueOf(i);
            // System.out.println(PanDigitalArray.get(i));
        }
        ArrayList<String> Numbers = permute(PanDigitalArray);
        for (int i = 0; i < Numbers.size(); i++) {
            char firstchar = Numbers.get(i).charAt(0);
            if (firstchar == '0') {
                continue;
            }
            if (isSubStringDivisible(Numbers.get(i)) == true) {
                BigInteger ToAdd = new BigInteger(Numbers.get(i));
                sum = sum.add(ToAdd);
            }
        }
        System.out.println(sum.toString());

    }
}
