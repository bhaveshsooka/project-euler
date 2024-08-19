package za.co.projects.eulerproblems.problems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

class Hand {
    private static String[] AllValues = {"2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K", "A"};

    private String Card1;
    private String Card2;
    private String Card3;
    private String Card4;
    private String Card5;

    // Constructor
    public Hand(String c1, String c2, String c3, String c4, String c5) {
        Card1 = c1;
        Card2 = c2;
        Card3 = c3;
        Card4 = c4;
        Card5 = c5;
    }

    /***********************************************************************/
    private String Sort(String input) {
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

    private String[] Sort(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int ai = Integer.parseInt(arr[i]);
                int aj = Integer.parseInt(arr[j]);
                if (ai > aj) {
                    String tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }

    private String getValue(String Card) {
        return Card.substring(0, 1);
    }

    private String[] getValues(Hand H) {
        String[] Values = new String[5];
        Values[0] = getValue(Card1);
        Values[1] = getValue(Card2);
        Values[2] = getValue(Card3);
        Values[3] = getValue(Card4);
        Values[4] = getValue(Card5);
        return Values;
    }

    private String getValues(Hand H, String Values) {
        Values = "";
        Values += getValue(Card1);
        Values += getValue(Card2);
        Values += getValue(Card3);
        Values += getValue(Card4);
        Values += getValue(Card5);
        return Values;
    }

    private String getSuit(String Card) {
        return Card.substring(1, 2);
    }

    private String[] getSuits(Hand H) {
        String[] Suits = new String[5];
        Suits[0] = getSuit(Card1);
        Suits[1] = getSuit(Card2);
        Suits[2] = getSuit(Card3);
        Suits[3] = getSuit(Card4);
        Suits[4] = getSuit(Card5);
        return Suits;
    }

    private int SearchValue(String val) {
        for (int i = 0; i < AllValues.length; i++) {
            if (AllValues[i].equals(val))
                return i;
        }
        return -1;
    }

    /***********************************************************************/

    /* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% */
    boolean CheckRoyalFlush(Hand H) {
        // Check all suit the same
        String[] CardSuits = getSuits(H);
        for (int i = 1; i < CardSuits.length; i++) {
            if (!CardSuits[i].equals(CardSuits[0]))
                return false;
        }

        String CardValues = "";
        CardValues = getValues(H, CardValues);
        CardValues = Sort(CardValues);
        String Answer = Sort("TJQKA");
        if (CardValues.equals(Answer))
            return true;
        return false;
    }

    boolean CheckStraightFlush(Hand H) {
        // Check all suit the same
        String[] CardSuits = getSuits(H);
        for (int i = 1; i < CardSuits.length; i++) {
            if (!CardSuits[i].equals(CardSuits[0]))
                return false;
        }

        String[] CardValues = getValues(H);
        String build = "";
        for (int i = 0; i < CardValues.length; i++) {
            String cardValue = CardValues[i];
            build += " " + SearchValue(cardValue);
        }
        String[] tmpArr = build.trim().split(" ");
        tmpArr = Sort(tmpArr);
        for (int i = 0; i < tmpArr.length - 1; i++) {
            int Prev = Integer.parseInt(tmpArr[i]);
            int Next = Integer.parseInt(tmpArr[i + 1]);
            if (Prev != Next - 1)
                return false;

        }
        return true;
    }

    boolean CheckFourKind(Hand H) {
        String[] CardValues = getValues(H);
        String build = "";
        for (int i = 0; i < CardValues.length; i++) {
            String cardValue = CardValues[i];
            build += " " + SearchValue(cardValue);
        }
        String[] tmpArr = build.trim().split(" ");
        for (int i = 0; i < tmpArr.length; i++) {
            int count = 1;
            for (int j = 0; j < tmpArr.length; j++) {
                if (i == j)
                    continue;

                if (tmpArr[i].equals(tmpArr[j]))
                    count++;
            }
            if (count == 4)
                return true;
        }
        return false;

    }

    boolean CheckFullHouse(Hand H) {
        String[] CardValues = getValues(H);
        String build = "";
        for (int i = 0; i < CardValues.length; i++) {
            String cardValue = CardValues[i];
            build += " " + SearchValue(cardValue);
        }
        String[] tmpArr = build.trim().split(" ");
        tmpArr = Sort(tmpArr);
        if (tmpArr[0].equals(tmpArr[1]) && tmpArr[0].equals(tmpArr[2])) {
            if (tmpArr[3].equals(tmpArr[4]))
                return true;
        }
        if (tmpArr[2].equals(tmpArr[3]) && tmpArr[2].equals(tmpArr[4])) {
            if (tmpArr[0].equals(tmpArr[1]))
                return true;
        }
        return false;
    }

    boolean CheckFlush(Hand H) {
        // Check all suit the same
        String[] CardSuits = getSuits(H);
        for (int i = 1; i < CardSuits.length; i++) {
            if (!CardSuits[i].equals(CardSuits[0]))
                return false;
        }
        return true;
    }

    boolean CheckStraight(Hand H) {
        String[] CardValues = getValues(H);
        String build = "";
        for (int i = 0; i < CardValues.length; i++) {
            String cardValue = CardValues[i];
            build += " " + SearchValue(cardValue);
        }
        String[] tmpArr = build.trim().split(" ");
        tmpArr = Sort(tmpArr);
        for (int i = 0; i < tmpArr.length - 1; i++) {
            int Prev = Integer.parseInt(tmpArr[i]);
            int Next = Integer.parseInt(tmpArr[i + 1]);
            if (Prev != Next - 1)
                return false;

        }
        return true;
    }

    boolean CheckThreeKind(Hand H) {
        String[] CardValues = getValues(H);
        String build = "";
        for (int i = 0; i < CardValues.length; i++) {
            String cardValue = CardValues[i];
            build += " " + SearchValue(cardValue);
        }
        String[] tmpArr = build.trim().split(" ");
        for (int i = 0; i < tmpArr.length; i++) {
            int count = 1;
            for (int j = 0; j < tmpArr.length; j++) {
                if (i == j)
                    continue;

                if (tmpArr[i].equals(tmpArr[j]))
                    count++;
            }
            if (count == 3)
                return true;
        }
        return false;
    }

    boolean CheckTwoPair(Hand H) {
        String[] CardValues = getValues(H);
        String build = "";
        for (int i = 0; i < CardValues.length; i++) {
            String cardValue = CardValues[i];
            build += " " + SearchValue(cardValue);
        }
        String[] tmpArr = build.trim().split(" ");
        tmpArr = Sort(tmpArr);
        if (tmpArr[0].equals(tmpArr[1])) {
            if (tmpArr[2].equals(tmpArr[3]))
                return true;
            if (tmpArr[3].equals(tmpArr[4]))
                return true;
        }
        if (tmpArr[1].equals(tmpArr[2])) {
            if (tmpArr[3].equals(tmpArr[4]))
                return true;
        }
        return false;
    }

    boolean CheckPair(Hand H) {
        String[] CardValues = getValues(H);
        String build = "";
        for (int i = 0; i < CardValues.length; i++) {
            String cardValue = CardValues[i];
            build += " " + SearchValue(cardValue);
        }
        String[] tmpArr = build.trim().split(" ");
        tmpArr = Sort(tmpArr);
        for (int i = 0; i < tmpArr.length; i++) {
            for (int j = 0; j < tmpArr.length; j++) {
                if (i == j)
                    continue;
                if (tmpArr[i].equals(tmpArr[j]))
                    return true;
            }
        }
        return false;

    }

    int getMaxValue(Hand H) {
        int max = -1;
        String[] CardValues = getValues(H);
        for (int i = 0; i < CardValues.length; i++) {
            String cardValue = CardValues[i];
            int iCardValue = SearchValue(cardValue);
            if (iCardValue > max)
                max = iCardValue;
        }
        return max;
    }

    /* %%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%% */

    int getValueOfhand(Hand H) {
        if (CheckRoyalFlush(H))
            return 10;
        if (CheckStraightFlush(H))
            return 9;
        if (CheckFourKind(H))
            return 8;
        if (CheckFullHouse(H))
            return 7;
        if (CheckFlush(H))
            return 6;
        if (CheckStraight(H))
            return 5;
        if (CheckThreeKind(H))
            return 4;
        if (CheckTwoPair(H))
            return 3;
        if (CheckPair(H))
            return 2;
        return 1;
    }

    String PrintHand() {
        return Card1 + " " + Card2 + " " + Card3 + " " + Card4 + " " + Card5;
    }
}

public class Problem054 {
    public static void main(String[] args) {
        int[] Exceptions = {5, 39, 42, 47, 66, 79, 90, 121, 139, 176, 234, 271, 279, 285, 288, 290, 292, 320, 338, 347, 357, 439, 453, 454, 465, 488, 491, 493, 497, 498, 525, 533, 549, 559, 562, 568, 589, 590, 602, 603, 659, 667, 683, 691, 701, 702, 761, 772, 785, 786, 793, 802, 803, 811, 818, 819, 821, 868, 871, 886, 889, 912, 918, 931, 938, 957, 965, 977, 983};

        Scanner in = new Scanner(System.in);
        ArrayList<Hand> Player1 = new ArrayList<Hand>();
        ArrayList<Hand> Player2 = new ArrayList<Hand>();
        Read_Data(Player1, Player2);
        int sum = 0;
        for (int i = 0; i < Player1.size(); i++) {
            Hand player1 = Player1.get(i);
            Hand player2 = Player2.get(i);
            int winner = FindWinner(player1, player2);

            if (winner == -1) {
                if (Lookup(Exceptions, i) == true) {
                    sum++;
                }
            } else
                sum += winner;
        }
        System.out.println(sum);

        in.close();
    }

    static boolean Lookup(int[] Arr, int key) {
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] == key)
                return true;
        }
        return false;
    }

    static int FindWinner(Hand h1, Hand h2) {
        int p1 = h1.getValueOfhand(h1);
        int p2 = h2.getValueOfhand(h2);
        if (p1 > p2)
            return 1;
        else if (p1 < p2)
            return 0;
        else {
            if (p1 == 1) {
                int p1max = h1.getMaxValue(h1);
                int p2max = h2.getMaxValue(h2);
                if (p1max > p2max)
                    return 1;
                else if (p1max < p2max)
                    return 0;
                else {
                    // System.out.print("Player 1 : " + p1 +
                    // "************Player 2 : " + p2 + "\n");
                    return -1;
                }
            } else {
                // System.out.print("Player 1 : " + p1 +
                // "************Player 2 : " + p2 + "\n");
                return -1;
            }
        }
    }

    public static void Read_Data(ArrayList<Hand> Player1, ArrayList<Hand> Player2) {
        String Path = System.getProperty("user.dir") + "\\src\\Resources\\Q054_1.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader(Path));
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] BothHands = line.split(" ");
                Hand player1 = new Hand(BothHands[0], BothHands[1], BothHands[2], BothHands[3], BothHands[4]);
                Hand player2 = new Hand(BothHands[5], BothHands[6], BothHands[7], BothHands[8], BothHands[9]);
                Player1.add(player1);
                Player2.add(player2);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
}
