package ExceptionHandling;
// Exception in lambda used inside stream
import java.util.Arrays;
import java.util.List;

public class T41 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1","a","3");
        list.stream().map(Integer::parseInt).forEach(System.out::println);
        // Explanation: Stream processing throws exception at element "a"; stack trace printed; prior elements processed.
    }
}
