package Operators;

public class Day_10 {
    public static void main(String[] args) {
        int i = 1;
        int j = ++i + i++;
        System.out.println(i + " " + j);
        // Explanation: ++i makes i=2 (yield 2), i++ yields 2 then i becomes 3; j = 2 + 2 = 4.
        //Teaching tip: Always dry-run with a table: track i before/after each operand.
        // Rules to remember 🧠
        //
        //1️⃣ Java evaluates expressions left to right
        //2️⃣ ++i (pre-increment): increment first, then use
        //3️⃣ i++ (post-increment): use first, then increment
    }
}
