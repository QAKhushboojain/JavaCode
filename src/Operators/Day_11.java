package Operators;

public class Day_11 {
    public static void main(String[] args) {
        int i = 1;
        i = i++;
        System.out.println(i);
        // Explanation: i++ yields old value 1; assignment i = 1 sets i to 1 (no net change). Very common trap.
    }
}
