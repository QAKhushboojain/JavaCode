package Operators;

public class Day_19 {
    public static void main(String[] args) {
        int a [] = {1,2,3,4};
        int i = 0;
        a[i++] = 10;
        System.out.println(java.util.Arrays.toString(a));
        // Explanation: a[i++] uses index 0 then increments i, sets a[0]=10.
    }
}
