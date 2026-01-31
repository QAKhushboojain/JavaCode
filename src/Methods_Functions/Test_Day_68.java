package Methods_Functions;

public class Test_Day_68 {
    static void f(String s)
    {
        s = s.replace('a','b');
        System.out.println(s);
    }

    public static void main(String[] args) {
        String s = "a";
        f(s);
        System.out.println(s);
        // Explanation: strings immutable; local reassignment only.
    }
    }

