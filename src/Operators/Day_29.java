package Operators;

public class Day_29 {
    static void foo(int x, int y)
    {
        System.out.println(x + " " + y);
    }

    public static void main(String[] args) {
        int i = 1;
        foo(i++, i++);
// Explanation: Java evaluates parameters left→right. First param i++ yields 1 (i->2), second i++ yields 2 (i->3).
    }

}



