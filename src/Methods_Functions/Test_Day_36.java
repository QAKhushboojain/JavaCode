package Methods_Functions;

public class Test_Day_36 {
    static void m(long l)
    {
        System.out.println("long");
    }
    static void m(Integer i)
    {
        System.out.println("Integer");
    }
    public static void main(String[] a)
    {
        m(5);
        // Explanation: primitive widening (int→long) preferred over boxing (int→Integer)
    }

}
