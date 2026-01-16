package ExceptionHandling;

public class T8 {
    public static void main(String[] args) {
        try {
            String s = "abc";
            System.out.println(s.charAt(3));
        }
        catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("String Index Out Of Bounds Exception");
            // Explanation: charAt(3) invalid for length 3; exception caught.
        }
    }
}
