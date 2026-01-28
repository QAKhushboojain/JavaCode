package Methods_Functions;

public class Test_Day_37 {
    static void m(Integer i)
    {
        System.out.println("Integer");
    }
    static void m(int i)
    {
        System.out.println("int");
    }
    public static void main(String[] a)
    {
        m(5);
        // Explanation: exact primitive match.
    }

}
