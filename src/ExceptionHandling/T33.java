package ExceptionHandling;
// ClassCastException
public class T33 {
    public static void main(String[] args) {
        Object s = "abc";
        Integer i = (Integer) s;
        // Explanation: Invalid type cast causes ClassCastException.
    }
}
