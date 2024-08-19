package za.co.projects.eulerproblems.problems;

public class Problem036 {
    public static boolean isPalindrome(String s) {
        s.toLowerCase();
        String back = "";
        int n = s.length();
        for (int i = n; i > 0; i--) {
            String t = s.substring(i - 1, i);
            back = back + t;
        }
        if (s.equals(back)) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        int sum = 0;
        for (int i = 0; i < 1000000; i++) {
            String a = Integer.toString(i);
            String b = Integer.toBinaryString(i);
            //System.out.println(b);
            if (isPalindrome(a)) {
                if (isPalindrome(b)) {
                    sum = sum + i;
                }
            }
        }
        System.out.println(sum);
    }
}
