package Operators;

public class Day_37 {
    public static void main(String[] args) {
        int i = 2;
        int j = (i *= 2) + (i *= 3);
        System.out.println(i + " " + j);
// Explanation: left→right:
//(i *= 2) sets i=4 yields 4
//(i *= 3) sets i=12 yields 12
//j = 4 + 12 = 16 — Wait check: above gave 10; correct result is j=16 and final i=12. Show step-by-step.
    }

}
