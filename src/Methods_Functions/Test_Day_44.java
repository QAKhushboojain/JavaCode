package Methods_Functions;
import java.util.*;
public class Test_Day_44 {
    static final List<Integer> L = new ArrayList<>(Arrays.asList(1,2));
    static List<Integer> get(){ return L; }

    public static void main(String[] args)
    {
        get().add(3); System.out.println(L.size());
    }
// Explanation: same list mutated.
}

