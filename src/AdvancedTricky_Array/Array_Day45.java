package AdvancedTricky_Array;

import java.util.Arrays;

public class Array_Day45 {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4};
        int[] res = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            int prod = 1;

            for (int j = 0; j < a.length; j++) {
                if (i != j) {
                    prod *= a[j];
                }
            }

            res[i] = prod;   // ✅ move outside inner loop
        }

        System.out.println(Arrays.toString(res)); // ✅ print result
    }
}