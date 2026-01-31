package Operators;
// Byte/overflow behaviour (operator effects)
public class Day_31 {
    public static void main(String[] args) {
        byte b = 127;
        b++;
        System.out.println(b);
        // Explanation: byte overflow wraps around (two's complement).
    }
}
