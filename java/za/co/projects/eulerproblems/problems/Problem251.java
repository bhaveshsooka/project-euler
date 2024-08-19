public class Problem251 {
    public static void main(String args[]) {
        long sum = 0;
        for (int a = 0; a < 500; a++) {
            for (int b = 0; a < 500; b++) {
                for (int c = 0; a < 500; c++) {
                    if (isCardano(a, b, c)) {

                        if (a + b + c <= 110000000) {
                            sum++;
                        }
                    }
                }
            }
        }
        System.out.println(sum);
    }

    public static boolean isCardano(int a, int b, int c) {
        double term2 = b * (Math.sqrt(c));

        double cbrt1 = Math.cbrt(a + (term2));
        double cbrt2 = Math.cbrt(a - (term2));

        if ((cbrt1 + cbrt2) == 1) {
            return true;
        } else {
            return false;
        }
    }
}
