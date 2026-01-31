package Operators;

public class Day_18 {
    public static void main(String[] args) {
        int a [] = {10,20,30,40};
        int i = 0;
        System.out.println(a[i++]);
        System.out.println(a[++i]);
        // Explanation: a[i++] returns a[0], i->1; a[++i] increments i->2 then returns a[2]=30.
    }
}
