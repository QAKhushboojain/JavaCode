package Methods_Functions;

public class Test_Day_23 {
    static class A{
        void m(){
            System.out.println("OK");
        }
    }
    public static void main(String[] args) {
        A x = null;
        // x.m(); // Uncommenting causes NullPointerException
        System.out.println("Done");
        // Explanation: cannot call instance method on null reference.
    }
}
