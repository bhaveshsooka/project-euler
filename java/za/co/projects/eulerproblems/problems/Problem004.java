package za.co.projects.eulerproblems.problems;

public class Problem004 {
    public static boolean isPalindrome(String s) {
        s.toLowerCase();
        String back = "";
        int i = s.length() - 1;
        int j = i + 1;
        while (i > -1) {
            String t = s.substring(i, j);
            back = back + t;
            i--;
            j--;
        }
        if (s.equals(back)) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        int max = 0;
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                int val = i * j;
                String sval = Integer.toString(val);
                if ((isPalindrome(sval)) && (val >= max)) {
                    max = val;
                }
            }
        }
        System.out.println(max);
    }
}
