package za.co.projects.eulerproblems.problems;

import java.util.ArrayList;

class triple {
    int a;
    int b;
    int c;

    public triple(int x, int y, int z) {
        a = x;
        b = y;
        c = z;
    }
}

public class Problem039 {
    static ArrayList<Integer> Perimeters = new ArrayList<Integer>();
    static ArrayList<Integer> Counts = new ArrayList<Integer>();
    static ArrayList<triple> Combos = new ArrayList<triple>();

    public static boolean isPythagorean(int a, int b, int c) {
        int asqu = a * a;
        int bsqu = b * b;
        int csqu = c * c;
        if (((asqu + bsqu) == csqu) || ((asqu + csqu) == bsqu)
          || ((csqu + bsqu) == asqu)) {
            return true;
        }
        return false;
    }

    public static void UpdateArrays(int p, triple trip) {
        if (!Perimeters.contains(p)) {
            Perimeters.add(p);
            Counts.add(1);
            Combos.add(trip);
        } else
        // Seen perimeter
        {
            if (Contains(Combos, trip) == false) {
                int key = ArrayListLookup(p);
                Counts.set(key, Counts.get(key) + 1);
                Combos.add(trip);
            }
        }
    }

    public static int ArrayListLookup(int val) {
        for (int i = 0; i < Perimeters.size(); i++) {
            if (Perimeters.get(i) == val)
                return i;
        }
        return -1;
    }

    public static Boolean Contains(ArrayList<triple> array, triple trip) {
        for (triple elem : array) {
            if (elem.a == trip.a)// a=x
            {
                if ((elem.b == trip.b) && (elem.c == trip.c)) {
                    return true;
                }
                if ((elem.b == trip.c) && (elem.c == trip.b)) {
                    return true;
                }

            }
            if (elem.b == trip.a)// b=x
            {
                if ((elem.a == trip.b) && (elem.c == trip.c)) {
                    return true;
                }
                if ((elem.a == trip.c) && (elem.c == trip.b)) {
                    return true;
                }
            }
            if (elem.c == trip.a)// c=x
            {
                if ((elem.a == trip.b) && (elem.b == trip.c)) {
                    return true;
                }
                if ((elem.a == trip.c) && (elem.b == trip.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Perimeters.clear();
        Counts.clear();
        Combos.clear();
        for (int i = 1; i < 1000; i++) {
            for (int j = 1; j < 1000; j++) {
                for (int k = 1; k < 1000; k++) {
                    if (isPythagorean(i, j, k) == true) {
                        int Perimeter = i + j + k;
                        if (Perimeter > 1000)
                            continue;
                        triple trip = new triple(i, j, k);
                        UpdateArrays(Perimeter, trip);
                    }
                }
            }
        }

        int max = Counts.get(0);
        int maxidx = 0;
        for (int i = 0; i < Counts.size(); i++) {
            if (Counts.get(i) > max) {
                max = Counts.get(i);
                maxidx = i;
            }
        }
        System.out.println(Perimeters.get(maxidx));
    }
}
