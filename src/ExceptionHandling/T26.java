package ExceptionHandling;
// Finally modifies a returned object reference
public class T26 {
    static StringBuilder m() {
        StringBuilder sb = new StringBuilder("A");
        try {
            return sb;
        } finally {
            sb.append("B");
        }
    }
        public static void main(String[] args)
        {
            System.out.println(m());
            // Explanation: Returned object can be modified in finally because return returns reference (modification visible).
        }
    }

