package Operators;

public class Day_20 {
    public static void main(String[] args) {
        int a [] = {1,2,3};
        int i = 0;
        a[++i] = i++;
        System.out.println(java.util.Arrays.toString(a) + " i=" + i);
        // Explanation: Evaluate left→right:
        //++i increments i to 1 -> left index is 1
        //Right-hand i++ yields 1 and then i becomes 2
        //a[1] = 1 -> Wait check: actually right-hand yields 1 so a[1]=1 -> but initial a[1] was 2. Let's compute carefully: initial i=0; ++i -> i=1 (index 1), i++ yields 1 then i becomes 2; assign a[1]=1; final array [1,1,3] and i=2.
        //(These are confusing; avoid chaining increments across both sides.)
        //(Trainer note: avoid such constructs; use simpler code.)
    }
}
