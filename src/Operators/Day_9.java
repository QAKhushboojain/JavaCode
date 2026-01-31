package Operators;

public class Day_9 {
    public static void main(String[] args) {
        int i = 1;
        int j = i++ + ++i;
        System.out.println(i + " " + j);
        // 1️⃣ Java evaluates expressions left to right
        //2️⃣ i++ → use value first, then increment
        //3️⃣ ++i → increment first, then use value
        // i = 1
        //i++  → use 1, i becomes 2
        //++i  → i becomes 3, use 3
        //j = 1 + 3 = 4
        // Explanation: Evaluate left→right:
        //i++ yields 1 (i becomes 2)
        //++i increments i to 3, yields 3
        //j = 1 + 3 = 4? Wait — this is a classic trap. Actually in Java after i++ (yield 1, i->2), ++i (i->3 yields 3): j = 1 + 3 = 4 and i becomes 3 → expected j=4.
        //(Important: avoid such expressions in real code — they’re confusing).
        //(Trainer note: don't create ambiguous code; for interviews, if asked compute carefully.)
    }
}
