package za.co.projects.eulerproblems.problems;

import java.util.ArrayList;


public class Problem029 {
    public static void main(String args[]) {
        ArrayList<Double> numbers = new ArrayList<Double>();
        for (int a = 2; a < 101; a++) {
            for (int b = 2; b < 101; b++) {
                double base = Double.parseDouble(Integer.toString(a));
                double exponent = Double.parseDouble(Integer.toString(b));
                double val = Math.pow(base, exponent);
                if (!numbers.contains(val)) {
                    numbers.add(val);
                }
            }
        }
        System.out.println(numbers.size());
    }
}
