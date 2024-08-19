package za.co.projects.eulerproblems.problems;

public class Problem038 {
    public static Boolean isPandigital(String Number) {
        String Sorted = SortString(Number);
        return Sorted.equals("123456789");
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

    public static void main(String[] args) {
        long Max = 0;
        for (long num = 9000; num <= 9999; num++) {
            int iterator = 1;
            String ConcatProduct = "";
            while (ConcatProduct.length() < 9) {
                long tmp = num * iterator;
                ConcatProduct += String.valueOf(tmp);
                iterator += 1;
                //System.out.println(ConcatProduct);
            }
            if (isPandigital(ConcatProduct) == true) {
                Long LocalMax = Long.valueOf(ConcatProduct);
                if (LocalMax > Max)
                    Max = LocalMax;
            }
            //System.out.println(num);
            //break;
        }
        System.out.println(Max);
    }
}
