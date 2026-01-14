package Array.NestedLoop_PatternPrintingUsing_Array;

public class Array_Day47 {
    public static void main(String[] args) {

        int[] a = {1, 2, 3};

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(a[j] + " ");  // ✅ print in same line
            }
            System.out.println(); // ✅ move to next line after each row
        }
    }
}