package MultipleDimensional_Array;

import java.util.Arrays;

public class Array_Day42 {
    public static void main(String[] args) {
        int m [] [] = {{1,2,3}, {4,5,6}};
        int[][] t = new int[m[0].length][m.length];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                t[j][i] = m[i][j];
                // Explanation: rows ↔ columns.
            }
        }

        // Print after full transpose
        System.out.println(Arrays.deepToString(t));
    }
}