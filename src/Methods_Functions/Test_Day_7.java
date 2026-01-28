package Methods_Functions;

import javax.swing.*;

public class Test_Day_7{
    static int foo()
    {
        int x = 1;
        try {
            return x;
        }
        finally {
            x = 2;
        }
    }

    public static void main(String[] args) {
        System.out.println(foo());
        // Explanation: return value already computed (primitive) — finally changes local but not returned value.
    }
}
