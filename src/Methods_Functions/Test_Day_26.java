package Methods_Functions;

public class Test_Day_26 {
    static void ex()
    {
        throw new RuntimeException("err");
    }

    public static void main(String[] args) {
        try {
            ex();
        }
        catch (Exception e)
        {
            System.out.println("Caught");
            // Explanation: runtime exception caught.
        }
    }
}
