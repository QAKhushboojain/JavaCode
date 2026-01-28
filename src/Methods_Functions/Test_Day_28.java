package Methods_Functions;

import java.util.function.Supplier;

public class Test_Day_28 {
    static int x = 10;

    public static void main(String[] args) {
        Supplier<Integer> s = () -> x + 5;
        System.out.println(s.get());
        // Explanation: lambda returns x+5.
    }
}
