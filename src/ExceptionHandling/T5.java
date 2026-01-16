package ExceptionHandling;

public class T5 {
    public static void main(String[] args) {
        try {
            System.out.println("Start");
            return;
        }
        finally {
            System.out.println("Finally");
            // Explanation: finally executes even if return in try. Program ends after finally.
            // try → print Start
            //try → return requested
            //finally → print Finally
            //method exits
        }
    }
}
