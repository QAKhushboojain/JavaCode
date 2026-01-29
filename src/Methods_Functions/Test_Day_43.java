package Methods_Functions;
import java.util.*;
public class Test_Day_43 {
    static List<Integer> get()
    {
        return new ArrayList<>(Arrays.asList(1,2));
    }

    public static void main(String[] args) {
        List<Integer> i = get();
        i.add(3);
        System.out.println(get().size());
        // Explanation: get() returns a new list each call.
    }

}
