package Methods_Functions;
import java.util.*;
public class Test_Day_53 {
    static <T> List<T> empty()
    {
        return Collections.emptyList();
    }

    public static void main(String[] args) {
        List<String> l = empty();
        System.out.println(l.size());
// Explanation: generic method returns empty list
    }


}
