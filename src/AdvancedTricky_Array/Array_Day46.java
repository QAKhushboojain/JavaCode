package AdvancedTricky_Array;

public class Array_Day46 {
    public static void main(String[] args) {
        int[] a = {2, 2, 1, 1, 1, 2, 2};

        int count = 0, cand = 0;

        // Step 1: Find candidate
        for (int v : a) {
            if (count == 0) {
                cand = v;
                count = 1;
            } else if (cand == v) {
                count++;
            } else {
                count--;
            }
        }

        // Step 2: Verify candidate
        count = 0;
        for (int v : a) {
            if (v == cand) count++;
        }

        if (count > a.length / 2) {
            System.out.println("Majority Element: " + cand);
        } else {
            System.out.println("No Majority Element");
        }
    }
}