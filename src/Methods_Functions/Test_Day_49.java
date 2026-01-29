package Methods_Functions;

public class Test_Day_49 {
  /*  static void m(int[] a)
    {
        System.out.println("array");
    } */
    static void m(int... a)
    {
        System.out.println("varargs");
    }

    public static void main(String[] args) {
        m(new int[]{1,2});
// Explanation: exact int[] matches first method.
    }

}
