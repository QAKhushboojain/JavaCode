package Methods_Functions;

public class Test_Day_12 {
    static Integer i = null;
    public static void main(String[] args) {
        System.out.println(i + 1);
        // Exception in thread "main" java.lang.NullPointerException
        //Explanation: unboxing null to int causes NPE
    }
}
