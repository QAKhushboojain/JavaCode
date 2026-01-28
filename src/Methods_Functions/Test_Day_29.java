package Methods_Functions;

import java.util.function.Function;

public class Test_Day_29 {
    static String up(String s){ return s.toUpperCase(); }
    public static void main(String[] a){
        Function<String,String> f = Test_Day_29::up;
        System.out.println(f.apply("hi"));
        // method reference to static method
    }
}

