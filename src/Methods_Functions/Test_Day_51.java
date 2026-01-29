package Methods_Functions;

public class Test_Day_51 {
    static void f()
    {
        try { throw new RuntimeException("e");
        }
        finally
        {
            System.out.println("finally");
        }
    }

    public static void main(String[] args) {
        try
        {
            f();
        } catch(Exception e){ System.out.println("caught");
        }
        // Explanation: finally executes before exception is propagated.

    }

    }
