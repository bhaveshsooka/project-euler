package za.co.projects.eulerproblems.problems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Problem067 {
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
        ArrayList<String> input = new ArrayList<String>();
        String Filename = System.getProperty("user.dir") + "\\src\\Resources\\Q067_1.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader(Filename));
            String line = "";
            while ((line = br.readLine()) != null) {
                input.add(line);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }

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
