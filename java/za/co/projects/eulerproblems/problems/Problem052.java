package za.co.projects.eulerproblems.problems;

public class Problem052 {
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

    public static void main(String[] args) {
        int num = 100;
        while (true) {
            String orig = String.valueOf(num);
            String orig6 = String.valueOf(num * 6);
            if (orig.length() < orig6.length()) {
                num++;
                continue;
            }

            boolean found = true;
            for (int i = 2; i <= 6; i++) {
                String TestNum = String.valueOf(num * i);
                //System.out.println(TestNum);
                if (CheckPerm(orig, TestNum) == false) {
                    found = false;
                    break;
                }
            }

            if (found)
                break;
//			if(num == 105)
//				break;
            num++;
        }
        System.out.println(num);
    }
}
