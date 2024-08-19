package za.co.projects.eulerproblems.problems;

public class Problem040 {
    public static void main(String[] args) {
        char d1 = FindDigitInFraction(1);
        char d10 = FindDigitInFraction(10);
        char d100 = FindDigitInFraction(100);
        char d1000 = FindDigitInFraction(1000);
        char d10000 = FindDigitInFraction(10000);
        char d100000 = FindDigitInFraction(100000);
        char d1000000 = FindDigitInFraction(1000000);

        // System.out.println(d1);
        // System.out.println(d10);
        // System.out.println(d100);
        // System.out.println(d1000);
        // System.out.println(d10000);
        // System.out.println(d100000);
        // System.out.println(d1000000);

        long Result = Long.valueOf(String.valueOf(d1))
          * Long.valueOf(String.valueOf(d10))
          * Long.valueOf(String.valueOf(d100))
          * Long.valueOf(String.valueOf(d1000))
          * Long.valueOf(String.valueOf(d10000))
          * Long.valueOf(String.valueOf(d100000))
          * Long.valueOf(String.valueOf(d1000000));
        System.out.println(Result);
    }

    public static char FindDigitInFraction(int nth) {
        String Fractional = "";
        int num = 1;
        while (Fractional.length() <= nth) {
            Fractional += String.valueOf(num);
            num += 1;
        }
        // System.out.println(Fractional);
        return Fractional.charAt(nth - 1);
    }
}
