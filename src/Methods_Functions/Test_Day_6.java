package Methods_Functions;

public class Test_Day_6 {
    static int foo()
    {
        try{
            return 1;
        }
        finally {
            return 2;
        }
    }

    public static void main(String[] args) {
        System.out.println(foo());
        // Explanation: finally return overrides try return.
    }
}
