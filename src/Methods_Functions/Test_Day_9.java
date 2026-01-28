package Methods_Functions;

public class Test_Day_9 {
    static void m(Object o)
    {
        System.out.println("Object");
    }
    static void m(String s)
    {
        System.out.println("String");
    }

    public static void main(String[] args) {
        m(null);
        // Explanation: overload resolution picks most specific (String).
    }


}
