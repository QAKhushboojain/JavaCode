package Methods_Functions;

public class Test_Day_46 {
    void Test()
    {
        System.out.println("Not Constructor");
    }

    public static void main(String[] args) {
        new Test_Day_46();
        System.out.println("Done");
        // Explanation: void Test() is a method, not constructor. No message printed.
    }
}
