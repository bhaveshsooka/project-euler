package za.co.projects.eulerproblems.problems;

public class Problem026 {
    public static void main(String args[]) {
        int SeqLength = 0;
        int Num = 0;
        for (int i = 1000; i > 1; i--) {
            if (SeqLength >= i)
                break;
            int[] FoundRemainders = new int[i];
            int value = 1;
            int position = 0;

            while (FoundRemainders[value] == 0 && value != 0) {
                FoundRemainders[value] = position;
                value *= 10;
                value %= i;
                position++;
            }

            if (position - FoundRemainders[value] > SeqLength) {
                Num = i;
                SeqLength = position - FoundRemainders[value];
            }
        }
        System.out.println(Num);
    }
}
