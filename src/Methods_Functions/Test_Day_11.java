package Methods_Functions;
// Autoboxing / unboxing pitfalls
public class Test_Day_11 {
    static void m(int i )
    {
        System.out.println("Int");
    }
    static void m(Integer i)
    {
        System.out.println("Integer");
    }

    public static void main(String[] args) {
     //   m(new Integer(5));
        m(5);
        // Explanation: exact reference type match chosen.
    }
}
