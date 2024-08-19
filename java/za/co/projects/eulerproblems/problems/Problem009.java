package za.co.projects.eulerproblems.problems;

public class Problem009 {
    public static boolean isPythagorean(int a, int b, int c) {
        int asqu = a * a;
        int bsqu = b * b;
        int csqu = c * c;
        if (((asqu + bsqu) == csqu) || ((asqu + csqu) == bsqu) || ((csqu + bsqu) == asqu)) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        int product = 0;
        boolean found = false;
        boolean found2 = false;
        for (int i = 0; i < 1000; i++) {
            if (found2) {
                break;
            }
            for (int j = 0; j < 1000; j++) {
                if (found) {
                    found2 = true;
                    break;
                }
                for (int k = 0; k < 1000; k++) {
                    if ((i != j) && (j != k)) {
                        if (((i + j + k) == 1000) && (isPythagorean(i, j, k))) {
                            product = i * j * k;
                            found = true;
                            break;
                        }
                    }
                }

            }
        }
        System.out.println(product);
    }
}
