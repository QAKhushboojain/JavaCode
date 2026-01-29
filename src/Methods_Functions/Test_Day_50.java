package Methods_Functions;

public class Test_Day_50 {
    static void m(long l)
    {
        System.out.println("long");
    }
    static void m(Integer i)
    {
        System.out.println("Integer");
    }

    public static void main(String[] args)
    {
        m((Integer)null);
    }
    // Explanation: explicit cast to Integer selects that overload; passing null to Integer ok.

}


