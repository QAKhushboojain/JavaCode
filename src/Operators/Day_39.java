package Operators;

public class Day_39 {
    public static void main(String[] args) {
        int i = 0;
        boolean b = (i++ > 0) && (++i > 0);
        System.out.println(i + " " + b);
// Explanation: left (i++ > 0) yields false (0>0? no) but i becomes 1. Right side not evaluated due to && short-circuit.
    }
}
