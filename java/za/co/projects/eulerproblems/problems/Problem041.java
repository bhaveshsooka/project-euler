package za.co.projects.eulerproblems.problems;

public class Problem041 {
    public static Boolean isPandigital(String Number, int length) {
        String Sorted = SortString(Number);
        String Comp = "";
        for (int i = 1; i <= length; i++) {
            Comp += String.valueOf(i);
        }
        return Sorted.equals(Comp);
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

    public static void main(String[] args) {
        for (long i = 7654321; i > 4321; i -= 2) {
            String Number = String.valueOf(i);
            if (isPandigital(Number, Number.length()) && isPrime(i)) {
                System.out.println(i);
                break;
            }
        }
    }

}
