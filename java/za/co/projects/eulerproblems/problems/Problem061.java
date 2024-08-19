package za.co.projects.eulerproblems.problems;

import java.util.ArrayList;

public class Problem061 {
    /*
     * public static Boolean isTriangular(long Number) { double triTest =
     * (Math.sqrt(1 + 8 * Number) - 1.0) / 2.0; return triTest == ((int)
     * triTest); }
     *
     * public static Boolean isSquare(long Number) { double sqrTest =
     * Math.sqrt(Number); return sqrTest == ((int) sqrTest); }
     *
     * public static Boolean isPentagonal(long Number) { double penTest =
     * (Math.sqrt(1 + 24 * Number) + 1.0) / 6.0; return penTest == ((int)
     * penTest); }
     *
     * public static Boolean isHexagonal(long Number) { double hexTest =
     * (Math.sqrt(1 + 8 * Number) + 1.0) / 4.0; return hexTest == ((int)
     * hexTest); }
     *
     * public static Boolean isHeptagonal(long Number) { double hepTest =
     * (Math.sqrt(9 + 40 * Number) + 3.0) / 4.0; return hepTest == ((int)
     * hepTest); }
     *
     * public static Boolean isOctagonal(long Number) { double octTest =
     * (Math.sqrt(1 + 3 * Number) + 1.0) / 3.0; return octTest == ((int)
     * octTest); }
     */

    static int[] solution;
    static int[][] numbers;

    public static int[] generateNumbers(int type) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int n = 0;
        int number = 0;

        while (number < 10000) {
            n++;
            switch (type) {

                case 0:
                    // Triangle numbers
                    number = n * (n + 1) / 2;
                    break;
                case 1:
                    // Square numbers
                    number = n * n;
                    break;
                case 2:
                    // Pentagonal numbers
                    number = n * (3 * n - 1) / 2;
                    break;
                case 3:
                    // Hexagonal numbers
                    number = n * (2 * n - 1);
                    break;
                case 4:
                    // Heptagonal numbers
                    number = n * (5 * n - 3) / 2;
                    break;
                case 5:
                    // Octagonal numbers
                    number = n * (3 * n - 2);
                    break;
            }
            if (number > 999)
                numbers.add(number);
        }

        return Convert(numbers);
    }

    public static int[] Convert(ArrayList<Integer> Arr) {
        int[] result = new int[Arr.size()];
        for (int i = 0; i < Arr.size(); i++) {
            result[i] = Arr.get(i);
        }
        return result;
    }

    public static boolean FindNext(int last, int length) {
        for (int i = 0; i < solution.length; i++) {
            if (solution[i] != 0)
                continue;
            for (int j = 0; j < numbers[i].length; j++) {

                boolean unique = true;
                for (int k = 0; k < solution.length; k++) {
                    if (numbers[i][j] == solution[k]) {
                        unique = false;
                        break;
                    }
                }

                if (unique && ((numbers[i][j] / 100) == (solution[last] % 100))) {
                    solution[i] = numbers[i][j];
                    if (length == 5) {
                        if (solution[5] / 100 == solution[i] % 100)
                            return true;
                    }
                    if (FindNext(i, length + 1))
                        return true;
                }
            }
            solution[i] = 0;
        }
        return false;
    }

    // 28684
    public static void main(String[] args) {
        int result = 0;
        solution = new int[6];

        numbers = new int[6][];

        for (int i = 0; i < 6; i++) {
            numbers[i] = generateNumbers(i);
        }

        for (int i = 0; i < numbers[5].length; i++) {
            solution[5] = numbers[5][i];
            if (FindNext(5, 1))
                break;
        }
        for (int i = 0; i < solution.length; i++) {
            result += solution[i];
        }
        System.out.println(result);
    }

}
