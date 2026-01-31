package Operators;

public class Day_7 {
    public static void main(String[] args) {
        byte b = 10;
        //  b = b + 5; // compilation error without cast
        b = (byte)(b + 5);
        System.out.println(b);
        // Explanation: b + 5 promotes to int; you need cast when using = but not with +=
        // Code	Result
        //b = b + 5;	❌ Compile-time error
        //b += 5;	✅ Works (implicit cast)
        //b = (byte)(b + 5);	✅ Works (explicit cast)
    }
}
