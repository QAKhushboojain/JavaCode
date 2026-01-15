package ExceptionHandling;

public class T1 {
    public static void main(String[] args) {
        int a = 10/0;
        System.out.println("Done");
        // Explanation: Division by zero on integer causes ArithmeticException; program stops before printing "Done".
    }
}
