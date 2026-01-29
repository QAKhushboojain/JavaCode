package Methods_Functions;

import java.util.function.Consumer;

public class Test_Day_45 {
    static void p(Object o)
    {
        System.out.println("obj");
    }
    static void p(String s)
    {
        System.out.println("str");
    }

    public static void main(String[] args) {
        Consumer<String> c = Test_Day_45::p; // chooses p(String)
        c.accept("x");

    }


}
