package Operators;
// byte + compound-assignment implicit cast
public class Day_6 {
    public static void main(String[] args) {
    byte b = 10;
    b += 5;
        System.out.println(b);
        // Explanation: b += 5 implicitly casts result back to byte. But b = b + 5; would require an explicit cast.
    }
}
