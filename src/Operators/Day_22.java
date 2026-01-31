package Operators;

public class Day_22 {
    public static void main(String[] args) {
        short s = 5;
        s += 10;
        System.out.println(s);
// Explanation: s += 10 implicitly casts back to short. But s = s + 10; would require cast.
    }
}
