package za.co.projects.eulerproblems.problems;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem018 {
    public static int[][] ArrayListToArray(ArrayList<String> m, int[][] mat) {
        for (int i = 0; i < m.size(); i++) {
            String s = m.get(i);
            String[] temp = s.split(" ");
            int[] t = new int[temp.length];
            for (int j = 0; j < temp.length; j++) {
                t[j] = Integer.parseInt(temp[j]);
            }
            mat[i] = t;
        }
        return mat;
    }

    public static int[] maximums(int[] top, int[] bottom) {
        int[] maxes = new int[top.length];
        for (int i = 0; i < top.length; i++) {
            int value = top[i];
            int max = 0;
            int n = value + bottom[i];
            int m = value + bottom[i + 1];
            if (n >= max) {
                max = n;
            }
            if (m >= max) {
                max = m;
            }
            maxes[i] = max;

        }
        return maxes;
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> input = new ArrayList<String>();
        for (int i = 0; i < 15; i++) {
            String s = in.nextLine();
            input.add(s);
        }
        in.close();
        int matrix[][] = new int[input.size()][];
        matrix = ArrayListToArray(input, matrix);
        int maxSum = matrix[0][0];
        for (int i = matrix.length - 2; i > 0; i--) {
            int[] dummy = new int[matrix[i].length];
            dummy = maximums(matrix[i], matrix[i + 1]);
            matrix[i] = dummy;
        }

        int minimax = 0;
        for (int i = 0; i < matrix[1].length; i++) {
            if (matrix[1][i] >= minimax) {
                minimax = matrix[1][i];
            }
        }
        maxSum = maxSum + minimax;
        System.out.println(maxSum);
    }
}
/*
75
95 64
17 47 82
18 35 87 10
20 04 82 47 65
19 01 23 75 03 34
88 02 77 73 07 63 67
99 65 04 28 06 16 70 92
41 41 26 56 83 40 80 70 33
41 48 72 33 47 32 37 16 94 29
53 71 44 65 25 43 91 52 97 51 14
70 11 33 28 77 73 17 78 39 68 17 57
91 71 52 38 17 14 91 43 58 50 27 29 48
63 66 04 68 89 53 67 30 73 16 69 87 40 31
04 62 98 27 23 09 70 98 73 93 38 53 60 04 23
*/
