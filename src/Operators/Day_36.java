package Operators;

public class Day_36 {
    public static void main(String[] args) {
        int i = 2;
        int j = i + (i *= 3);
        System.out.println(i + " " + j);
        // Explanation: (i *= 3) sets i=6, yields 6; left operand used original i (2), so j = 2 + 6 = 8
    }
}
