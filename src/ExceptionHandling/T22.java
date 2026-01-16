package ExceptionHandling;
//  throws on method and caller doesn't catch
public class T22 {
    static void m() throws Exception{
        throw  new Exception("e");
    }

    public static void main(String[] args) throws Exception {
        m();
        // Explanation: main declares throws, so exception propagates to JVM and is printed.
    }
}
