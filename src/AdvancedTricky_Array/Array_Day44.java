package AdvancedTricky_Array;

public class Array_Day44 {
    public static void main(String[] args) {
        // partition negatives to left (stable)
        int a [] = {1, -2, 3, -4, 5};
        int idx = 0;
        for(int i = 0; i<a.length; i++)
        {
            if(a[i]<0)
            {
                int t = a[i];
                a[i] = a[idx];
                a[idx] = t;
                idx++;
            }
        }
        System.out.println(java.util.Arrays.toString(a));
        // Explanation: negatives moved left (order not preserved for positives).
    }
}
