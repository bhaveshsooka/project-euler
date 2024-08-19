package za.co.projects.eulerproblems.problems;

public class Problem033 {
    public static void main(String[] args) {
        int TopProd = 1;
        int BottomProd = 1;
        // String fraction = "49,98";
        // String Expected = SimplifyFraction(RemoveSameDigits(fraction));
        // String Actual = SimplifyFraction(fraction);
        //
        // if(Actual.equals(Expected))
        // {
        // TopProd = TopProd * 49;
        // BottomProd = BottomProd * 98;
        // }
        // String FracResult = String.valueOf(TopProd) + "," +
        // String.valueOf(BottomProd);
        // String Result = SimplifyFraction(FracResult);
        // System.out.println(Result.split(",")[1]);
        for (int i = 10; i < 100; i++) {
            if (i % 10 == 0)
                continue;
            for (int j = i + 1; j < 101; j++) {
                if (j % 10 == 0)
                    continue;
                String fraction = String.valueOf(i) + "," + String.valueOf(j);

                String Expected = RemoveSameDigits(fraction);
                if (Expected.equals(fraction))
                    continue;
                Expected = SimplifyFraction(Expected);

                String Actual = SimplifyFraction(fraction);

                if (Actual.equals(Expected)) {
                    TopProd = TopProd * i;
                    BottomProd = BottomProd * j;
                    //System.out.println(i + "," + j);
                }
            }
        }
        String FracResult = String.valueOf(TopProd) + ","
          + String.valueOf(BottomProd);
        String Result = SimplifyFraction(FracResult);
        System.out.println(Result.split(",")[1]);
    }

    public static String SimplifyFraction(String Input) {
        int Numerator = Integer.parseInt(Input.split(",")[0]);
        int Denominator = Integer.parseInt(Input.split(",")[1]);

        int gcf = findGCF(Numerator, Denominator);
        Numerator = Numerator / gcf;
        Denominator = Denominator / gcf;
        return String.valueOf(Numerator) + "," + String.valueOf(Denominator);
    }

    public static int findGCF(int a, int b) {
        if (b == 0)
            return a;
        else
            return findGCF(b, a % b);
    }

    public static String RemoveSameDigits(String Input) {
        String Numerator = Input.split(",")[0];
        String Denominator = Input.split(",")[1];

        char Num0 = Numerator.charAt(0);
        char Num1 = Numerator.charAt(1);

        char Den0 = Denominator.charAt(0);
        char Den1 = Denominator.charAt(1);
        String Result = Input;
        if (Num0 == Den0) {
            Result = Num1 + "," + Den1;
        } else if (Num0 == Den1) {
            Result = Num1 + "," + Den0;
        } else if (Num1 == Den0) {
            Result = Num0 + "," + Den1;
        } else if (Num1 == Den1) {
            Result = Num0 + "," + Den0;
        }
        return Result;
    }
}
